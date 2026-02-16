import stages.GameScene;
import system.MainSceneDraw;
import system.ToonMaster;

public class Main {
    public static ToonMaster MASTER;
    private Main(){

    }
    public static void main(String[] args) {
        MASTER = new ToonMaster();
        MASTER.MAIN_WINDOW.sceneMaster.setScene(new GameScene(MASTER.MAIN_WINDOW.sceneMaster));
        MASTER.MAIN_WINDOW.setVisible(true);
    }
}
