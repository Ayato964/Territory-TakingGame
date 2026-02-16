package system;

import objects.ToonObject;
import utils.tools.Collider;
import utils.tools.RectCollider;

import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ColliderMaster implements Runnable{
    private static final ColliderMaster MASTER = new ColliderMaster();

    public CopyOnWriteArrayList<Collider> colliders = new CopyOnWriteArrayList<>();
    private boolean isRunning;

    private ColliderMaster(){
        Thread t = new Thread(this);
        t.start();
        isRunning = true;
    }

    @Override
    public void run() {
        while (isRunning){
            for(Collider c: colliders){
                ArrayList<ToonObject> objects = switch (c){
                    case RectCollider rc -> rectCol(rc.get());
                    case null, default -> throw new IllegalArgumentException("This is not Collider");
                };
                if(!objects.isEmpty())
                    c.inObject(objects);
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private ArrayList<ToonObject> rectCol(ToonObject src){
        ArrayList<ToonObject> objects = new ArrayList<>();
        for(Collider col: colliders){
            ToonObject tgt = col.get();
            if(!tgt.equals(src)){
                Rectangle2D srcRect = new Rectangle2D.Double(src.position.getX(), src.position.getY(), src.scale.getW(), src.scale.getH());
                Rectangle2D tgtRect = new Rectangle2D.Double(tgt.position.getX(), tgt.position.getY(), tgt.scale.getW(),tgt.scale.getH());
                if(srcRect.intersects(tgtRect))
                    objects.add(tgt);
            }
        }
        return objects;
    }

    public static ColliderMaster getMASTER() {
        return MASTER;
    }

    public void stop(){
        isRunning = false;
    }
}
