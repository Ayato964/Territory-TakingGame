package utils;

import system.Config;

import javax.naming.directory.AttributeInUseException;
import javax.print.AttributeException;

public class Position2D{
    private final int init_x, init_y;
    private int x, y;
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

    public int getInitX() {
        return init_x;
    }

    public int getInitY() {
        return init_y;
    }

    public int getX() {
        return x * Config.getINSTANCE().tileSize;
    }

    public int getY() {
        return y * Config.getINSTANCE().tileSize;
    }
}
