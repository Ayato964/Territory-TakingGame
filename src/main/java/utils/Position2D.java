package utils;

import system.Config;

import javax.naming.directory.AttributeInUseException;
import javax.print.AttributeException;

public class Position2D{
    private final float init_x, init_y;
    private float x, y;
    public Position2D(int x, int y) {
        if(x >= Config.getINSTANCE().maxScreenCol)
            throw new IllegalArgumentException("x is up to a maximum of " + Config.getINSTANCE().maxScreenCol + ".");
        if(y >= Config.getINSTANCE().maxScreenRow)
            throw new IllegalArgumentException("y is up to a maximum of " + Config.getINSTANCE().maxScreenRow + ".");

        this.x = x;
        this.y = y;
        init_x = x;
        init_y = y;
    }

    public float getInitX() {
        return init_x;
    }

    public float getInitY() {
        return init_y;
    }

    public float getX() {
        return x * Config.getINSTANCE().tileSize;
    }

    public float getY() {
        return y * Config.getINSTANCE().tileSize;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void addX(int x) {
        this.x += x;
    }

    public void addY(int y) {
        this.y += y;
    }

    public void add(Position2D position){
        float bx = getX() + position.getX();
        float by = getY() + position.getY();
        x = bx / Config.getINSTANCE().tileSize;
        y = by / Config.getINSTANCE().tileSize;

    }

    @Override
    public String toString() {
        return "x:" + getX() + "  y:" + getY();
    }
}
