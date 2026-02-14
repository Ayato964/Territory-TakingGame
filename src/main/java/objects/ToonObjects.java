package objects;

import utils.Position2D;
import utils.Scale2D;

import java.awt.*;

public abstract class ToonObjects {
    protected Position2D position;
    protected Scale2D scale;


    public ToonObjects(int x, int y, int w, int h){
        this(new Position2D(x, y), new Scale2D(w, h));
    }

    public ToonObjects(Position2D position, Scale2D scale){
        this.position = position;
        this.scale = scale;
    }

    public abstract void draw(Graphics2D g2d);


}
