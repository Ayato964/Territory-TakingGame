package utils;

import system.Config;

public class Scale2D{
    private final int initW, initH;
    private int w, h;

    public Scale2D(int initW, int initH) {
        if(initW >= Config.getINSTANCE().maxScreenCol)
            throw new IllegalArgumentException("w is up to a maximum of " + Config.getINSTANCE().maxScreenCol + ".");
        if(initH >= Config.getINSTANCE().maxScreenRow)
            throw new IllegalArgumentException("h is up to a maximum of " + Config.getINSTANCE().maxScreenRow + ".");

        this.initW = initW;
        this.initH = initH;
        w = initW;
        h = initH;
    }

    public int getInitH() {
        return initH;
    }

    public int getInitW() {
        return initW;
    }

    public int getW() {
        return w * Config.getINSTANCE().tileSize;
    }

    public int getH() {
        return h * Config.getINSTANCE().tileSize;
    }
}
