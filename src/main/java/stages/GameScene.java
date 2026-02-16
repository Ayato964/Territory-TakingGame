package stages;

import objects.CharacterFactory;
import objects.Territory;
import objects.ToonObject;
import system.MainSceneDraw;
import system.ToonArrayList;

import java.awt.*;

public class GameScene implements MainSceneDraw {

    private final ToonArrayList<ToonObject> objects = new ToonArrayList<>(this::isAddArray);

    public GameScene(){
        objects.add(CharacterFactory.TERRITORY_BLOCK.get(0, 120, 50, 50));
        objects.add(CharacterFactory.TERRITORY_BLOCK.get(500, 100, 100, 100));
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
        objects.getFirst().position.addX(1);
    }
}
