import java.applet.*;
import java.awt.*;

public class AnAppletWithParms extends Applet {
    public void init() {
        String operand1 =  getParameter("operand1");
        System.err.println("The 'operand1' parameter: " + operand1);
        int o1 = Integer.parseInt(operand1);
        System.out.println("In init: n = " + n);

        String operand2 =  getParameter("operand2");
        System.err.println("The 'operand2' parameter: " + operand2);
        int o2 = Integer.parseInt(operand2);

        String operand3 =  getParameter("operand3");
        System.err.println("The 'operand3' parameter: " + operand3);
        //int color = Integer.parseInt(colorParm);
        //setBackground(new Color(color));

        switch(operand3) {
            case "+":
                n=o1+o2;
                break;
            case "-":
                n=o1-o2;
                break;
            case "*":
                n=o1*o2;
                break;
            case "/":
                n=o1/o2;
                break;
        }
    }

    public void paint(Graphics g) {
        System.out.println("In paint: n = " + n);
    }

    int n;
}