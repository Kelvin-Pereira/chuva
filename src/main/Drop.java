package main;

import java.awt.*;
import java.util.Random;

public class Drop {

    private int x;
    private int y;
    private int yspeed;
    private int len;

    static Random random = new Random();

    public Drop() {
        start();
    }

    private void fall() {
        y = y + yspeed;
        if (y > 400) {
            start();
        }
    }

    void show(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(x, y, x, y + len);
        fall();
    }

    public void start() {
        x = random.nextInt(600);
        y = random.nextInt(-500, -50);
        yspeed = random.nextInt(4, 10);
        len = random.nextInt(10, 20);
    }

}
