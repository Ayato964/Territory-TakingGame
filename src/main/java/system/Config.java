package system;

public class Config {
    public final int originalTileSize = 4;
    public final int scale = 1;
    public final int tileSize = originalTileSize * scale; // 48x48 tile
    public final int maxScreenCol = 192;
    public final int maxScreenRow = 108;
    public final int screenWidth = tileSize * maxScreenCol; // 768 pixels
    public final int screenHeight = tileSize * maxScreenRow; // 576 pixels

    private static final Config INSTANCE = new Config();
    private float generalScaleW = 1.0f, generalScaleH = 1.0f;

    public Config(){

    }

    public float getGeneralScaleW() {
        return generalScaleW;
    }

    public float getGeneralScaleH() {
        return generalScaleH;
    }



    public static Config getINSTANCE() {
        return INSTANCE;
    }
}
