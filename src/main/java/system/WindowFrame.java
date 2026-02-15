package system;

import stages.GameScene;

import javax.swing.JFrame;

public class WindowFrame {
    public final JFrame window;
    public final ToonScene sceneMaster;
    public WindowFrame(MainSceneDraw scene){
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Territory Taking Game");

        sceneMaster = new ToonScene(scene);
        window.add(sceneMaster);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

}
