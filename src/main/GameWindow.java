package main;

import javax.swing.*;

public class GameWindow {

    public GameWindow() {

        JFrame jFrame = new JFrame();
        jFrame.setSize(600, 400);
        jFrame.setResizable(false);
        jFrame.add(new GamePanel());
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        Timer timer = new Timer(15, e -> jFrame.repaint());
        timer.start();
    }

}
