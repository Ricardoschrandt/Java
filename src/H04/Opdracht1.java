package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.BLACK);
        g.drawLine(30, 30, 60, 60);
        g.drawLine(30, 30, 0, 60);
        g.drawLine(0, 60, 60, 60);
        g.drawRect(0, 60, 60, 60);
        g.drawRect(10, 75, 15, 15);
        g.drawRect(30, 90, 15, 30);
    }


}