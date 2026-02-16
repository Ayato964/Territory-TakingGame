package system;

import utils.Tick;
import utils.tools.Collider;
import utils.tools.RectCollider;

import java.awt.*;

public abstract class MainSceneDraw implements Tick {
    protected final ToonScene scene;
    public MainSceneDraw(ToonScene scene){
        this.scene = scene;
    }

    public abstract void draw(Graphics2D g);

    public <T> void isAddArray(T r){
        if(r instanceof RectCollider)
            ColliderMaster.getMASTER().colliders.add((Collider) r);

        if(r instanceof Tick)
            SystemMaster.getMASTER().ticks.add((Tick) r);
    }

}
