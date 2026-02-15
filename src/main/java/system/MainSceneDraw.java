package system;

import utils.Tick;
import utils.tools.Collider;
import utils.tools.RectCollider;

import java.awt.*;

public interface MainSceneDraw extends Tick {
    public void draw(Graphics2D g);

    public default <T> void isAddArray(T r){
        if(r instanceof RectCollider)
            ColliderMaster.getMASTER().colliders.add((Collider) r);

        if(r instanceof Tick)
            SystemMaster.getMASTER().ticks.add((Tick) r);
    }

}
