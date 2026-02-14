package objects;

import utils.Position2D;
import utils.Scale2D;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class AbstractCharacterMaking extends ToonObjects {

    private final BufferedImage character;

    public AbstractCharacterMaking(int x, int y, int w, int h) {
        this(new Position2D(x, y), new Scale2D(w, h));
    }

    public AbstractCharacterMaking(Position2D position2D, Scale2D scale2D){
        super(position2D, scale2D);

        character = new BufferedImage(scale.getW(), scale.getH(), BufferedImage.TYPE_INT_RGB);
        Graphics2D chara_g = this.character.createGraphics();
        int center_x = this.character.getWidth() / 2;
        int center_y = this.character.getHeight() / 2;
        this.createCharacter(chara_g, center_x, center_y);
        chara_g.dispose();
    }

    @Override
    public final void draw(Graphics2D g2d) {
        g2d.drawImage(character, position.getX(), position.getY(), null);
    }

    protected abstract void createCharacter(Graphics2D g2d, int center_x, int center_y);

}
