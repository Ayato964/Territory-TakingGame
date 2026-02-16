package utils;

import system.Config;

public class Scale2D{
    private final float initW, initH;
    private float w, h;

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

    public float getInitH() {
        return initH;
    }

    public float getInitW() {
        return initW;
    }

    public float getW() {
        return w * Config.getINSTANCE().tileSize;
    }

    public float getH() {
        return h * Config.getINSTANCE().tileSize;
    }
}
