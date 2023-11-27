package main;

import java.awt.*;

public class Drop {

    private final int x = RandomValues.nextInt(600);
    private int y = RandomValues.nextInt(-300, -1);
    private final int yspeed = RandomValues.nextInt(4, 10);

    private void fall() {
        y = y + yspeed;
        if (y > 400) {
            y = RandomValues.nextInt(-300, -1);
        }
    }

    void show(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(x, y, x, y + 10);
        fall();
    }

}
