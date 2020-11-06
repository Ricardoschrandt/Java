package H06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    int a, b, uitkomst ;

    public void init() {

        a = 7;
        b = 5;
        uitkomst = 5 - 7;

    }

    public void paint  (Graphics g) {
        g.drawString("5 - 7 = " + uitkomst , 50, 60 );



    }



}
