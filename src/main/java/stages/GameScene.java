package stages;

import objects.CharacterFactory;
import objects.Player;
import objects.Territory;
import objects.ToonObject;
import system.Config;
import system.MainSceneDraw;
import system.ToonArrayList;
import system.ToonScene;

import java.awt.*;
import java.util.Random;

public class GameScene extends MainSceneDraw {

    public final ToonArrayList<ToonObject> objects = new ToonArrayList<>(this::isAddArray);
    public final Player player;

    public GameScene(ToonScene scene){
        super(scene);
        player = new Player(scene, this);
        Random rand = new Random();
        for(int i= 0; i < 10; i ++){
            int x = rand.nextInt(Config.getINSTANCE().maxScreenCol - 100), y = rand.nextInt(Config.getINSTANCE().maxScreenRow - 100);
            objects.add(CharacterFactory.TERRITORY_BLOCK.get(x, y, 100, 100));
        }

    }


    @Override
    public void draw(Graphics2D g) {
        g.setColor(new Color(0));
        g.fillRect(0, 0, 1920, 1080);
        for(ToonObject t: objects){
            t.draw(g);
        }
    }

    @Override
    public void tick() {
    }
}
