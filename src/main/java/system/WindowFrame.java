package system;

import stages.GameScene;

import javax.swing.JFrame;

public class WindowFrame {
    public final JFrame window;
    public final ToonScene sceneMaster;
    public WindowFrame(){
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Territory Taking Game");

        sceneMaster = new ToonScene();
        window.add(sceneMaster);
        window.pack();
        window.setLocationRelativeTo(null);
    }

    public void setVisible(boolean b){
        window.repaint();
        window.setVisible(b);
    }

}
