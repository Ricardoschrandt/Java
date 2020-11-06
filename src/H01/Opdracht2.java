package H01;



import java.awt.*;
import java.applet.*;


public class Opdracht2 extends Applet {

    public void init() {
        setBackground(Color.RED);

    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Welcome to Java!!", 50, 60 );
    }

}