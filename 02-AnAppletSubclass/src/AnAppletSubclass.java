import java.applet.Applet;
import java.awt.*;

/**
 * Created by linken on 12/1/16.
 */
public class AnAppletSubclass extends Applet {

    public void init() {
        System.err.println("Hello from AnAppletSubClass.init - the current value of n is " + n);
        String rParm = getParameter("red");
        String gParm = getParameter("green");
        String bParm = getParameter("blue");
        color = new Color(Integer.valueOf(rParm), Integer.valueOf(gParm), Integer.valueOf(bParm));
    }

    public void paint(Graphics g) {
        setBackground(color);
        System.err.println("Hello from AnAppletSubClass.paint-- the current value of n is " + n);
        n++;
        color=new Color((color.getRed()+1)%255, (color.getGreen()+1)%255,(color.getBlue()+1)%255);
        System.out.println("color: " + color.getRed() +"," + color.getBlue() +"," + color.getGreen());
        //repaint();
    }

    Color color;
    int n = 1;
}
