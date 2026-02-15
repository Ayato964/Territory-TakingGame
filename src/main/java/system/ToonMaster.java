package system;

public class ToonMaster implements Runnable{
    public final ColliderMaster COLLIDER_MASTER = ColliderMaster.getMASTER();
    public final SystemMaster TICK_MASTER = SystemMaster.getMASTER();
    public final WindowFrame MAIN_WINDOW;
    private boolean IS_RUNNING = true;
    public ToonMaster(MainSceneDraw firstScene){
        MAIN_WINDOW = new WindowFrame(firstScene);
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        final long TARGET_TIME = 1000L / 30; // 33ms

        while (IS_RUNNING) {
            long startTime = System.currentTimeMillis();

            MAIN_WINDOW.window.repaint();

            long timeTaken = System.currentTimeMillis() - startTime;
            long sleepTime = TARGET_TIME - timeTaken;

            try {
                if (sleepTime > 0) {
                    Thread.sleep(sleepTime);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
