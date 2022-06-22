import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class polygon extends Applet {

    public static void main(String[] args) {

        Frame a = new Frame();

        Applet Polygon = new polygon();
        a.add(Polygon);

        a.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        a.setSize(500, 500);
        a.setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);

        int[] x = { 30, 480, 300, 480, 30, 180 };
        int len = x.length;
        int[] y = new int[len];
        int i = len;

        for (int j = 0; j < len; j++) {
            y[j] = x[i - 1];
            i--;
        }

        g.drawPolygon(x, y, len);
    }
}
