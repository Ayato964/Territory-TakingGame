package system;

public class Config {
    public final float originalTileSize = 1;
    public final float scale = 0.6f;
    public final float tileSize = originalTileSize * scale; // 48x48 tile
    public final int maxScreenCol = 1920;
    public final int maxScreenRow = 1080;
    public final int screenWidth = (int) (tileSize * maxScreenCol); // 768 pixels
    public final int screenHeight = (int) (tileSize * maxScreenRow); // 576 pixels

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
