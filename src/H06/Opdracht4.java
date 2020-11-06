package H06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {


    double a, b, c , d  ;
    double uitkomst;


    public void init() {

        a = 5.9 ;
        b = 6.3 ;
        c = 6.9 ;
        d = 3 ;


        uitkomst = (a + b + c) / d ;


    }

    public void paint  (Graphics g) {
        g.drawString("Het gemiddelde van jantje " + uitkomst , 50, 60);
    }
}
