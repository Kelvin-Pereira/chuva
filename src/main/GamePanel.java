package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private Drop[] drops = new Drop[100];

    public GamePanel() {
        for(int i = 0; i < drops.length; i++){
            drops[i] = new Drop();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Drop drop : drops) {
            drop.show(g);
        }
    }

}
