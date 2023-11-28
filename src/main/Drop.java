package main;

import java.awt.*;
import java.util.Random;

public class Drop {

    private int x;
    private float y;
    private float yspeed;
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
        g.drawLine(x, (int)y, x, (int)y + len);
        fall();
    }

    public void start() {
        x = random.nextInt(600);//with
        y = random.nextInt(-500, -50);
        yspeed = random.nextFloat(0.09f, 0.2f);
        len = random.nextInt(10, 20);
    }

}
