package objects;

import stages.GameScene;
import system.ToonMaster;
import system.ToonScene;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;

public class Player implements KeyListener, MouseListener {
    private final ToonScene game;
    private final GameScene scene;

    public Player(ToonScene game, GameScene scene){
        this.game = game;
        this.scene = scene;
        game.addKeyListener(this);
        game.addMouseListener(this);

    }
    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        for(ToonObject o : scene.objects){
            Rectangle2D ro = o.getRectangle2D();
            if(ro.contains(mouseEvent.getX(), mouseEvent.getY())){
                switch (o){
                    case Territory territory: clickTerritory(territory); break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + o);
                }
            }
        }
    }

    private void clickTerritory(Territory t){
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
