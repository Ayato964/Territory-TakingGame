package objects;

import utils.Position2D;
import utils.Scale2D;
import utils.tools.Group;
import utils.tools.RectCollider;

import java.awt.*;
import java.util.ArrayList;

public class Territory extends AbstractCharacterMaking implements RectCollider, Group {
    public int group = 0;
    public Territory(Position2D position2D, Scale2D scale2D) {
        super(position2D, scale2D);
    }

    @Override
    protected void createCharacter( Graphics2D g2d, int center_x, int center_y) {
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, center_x * 2, center_y * 2);
    }


    @Override
    public void inObject(ArrayList<ToonObject> targets) {
        System.out.println("Conflict :" + targets.getFirst());

    }

    @Override
    public ToonObject get() {
        return this;
    }

    @Override
    public int getGroupID() {
        return group;
    }

    @Override
    public void setGroupID(int groupID) {
        group = groupID;
    }
}
