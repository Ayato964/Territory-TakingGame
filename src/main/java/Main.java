import stages.GameScene;
import system.MainSceneDraw;
import system.ToonMaster;

public class Main {
    public static ToonMaster MASTER;
    private Main(){

    }
    public static void main(String[] args) {
        MASTER = new ToonMaster(new GameScene());
    }
}
