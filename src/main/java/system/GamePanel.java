package system;

import objects.CharacterFactory;
import objects.ToonObjects;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.concurrent.CopyOnWriteArrayList;

public class GamePanel extends JPanel {


    private final CopyOnWriteArrayList<ToonObjects> objects = new CopyOnWriteArrayList<>();

    public GamePanel() {
        this.setPreferredSize(new Dimension(Config.getINSTANCE().screenWidth, Config.getINSTANCE().screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        objects.add(CharacterFactory.TEST_OBJECT.get(100, 50, 20, 20));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        for(ToonObjects o : objects){
            o.draw(g2);
        }

        g2.dispose();
    }
}
