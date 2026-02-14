package objects;

import utils.Position2D;
import utils.Scale2D;

import java.awt.Color;
import java.awt.Graphics2D;

public class TestObject extends AbstractCharacterMaking {

    public TestObject(Position2D position2D, Scale2D scale2D) {
        super(position2D, scale2D);
    }

    @Override
    protected void createCharacter(Graphics2D g2d, int center_x, int center_y) {
        g2d.setColor(new Color(255, 255, 255));
        g2d.fillRect(0, 0, center_x * 2, center_y * 2);
    }
}
