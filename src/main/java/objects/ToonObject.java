package objects;

import utils.Position2D;
import utils.Scale2D;

import java.awt.*;

public abstract class ToonObject {
    public Position2D position;
    public Scale2D scale;
    public Object[] anyOptions;


    public ToonObject(int x, int y, int w, int h, Object... objects){
        this(new Position2D(x, y), new Scale2D(w, h), objects);
    }

    public ToonObject(Position2D position, Scale2D scale, Object... objects){
        this.position = position;
        this.scale = scale;
        this.anyOptions = objects;
    }

    public abstract void draw(Graphics2D g2d);


}
