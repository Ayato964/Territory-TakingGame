package system;

import utils.Tick;
import java.util.concurrent.CopyOnWriteArrayList;

public class SystemMaster implements Runnable{
    private static final SystemMaster MASTER = new SystemMaster();

    public CopyOnWriteArrayList<Tick> ticks = new CopyOnWriteArrayList<>();
    private boolean isRunning;

    private SystemMaster(){
        Thread t = new Thread(this);
        t.start();
        isRunning = true;
    }

    @Override
    public void run() {
        while (isRunning){
            for(Tick t: ticks)
                t.tick();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static SystemMaster getMASTER() {
        return MASTER;
    }
}
