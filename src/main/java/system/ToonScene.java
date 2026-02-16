package system;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class ToonScene extends JPanel {

    public MainSceneDraw dr;
    public ToonScene() {
        this.setPreferredSize(new Dimension(Config.getINSTANCE().screenWidth, Config.getINSTANCE().screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void setScene(MainSceneDraw d){
        SystemMaster.getMASTER().ticks.remove(dr);

        SystemMaster.getMASTER().ticks.add(d);
        dr = d;

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        dr.draw(g2);
        g2.dispose();
    }
}
