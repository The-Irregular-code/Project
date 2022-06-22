package test;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends Applet {

    TextField t1, t2, t3;
    Button b;
    int x, y, z;

    public void init() {
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        b = new Button("Add");
        b.addActionListener(new test());
        add(t1);
        add(t2);
        add(t3);
        add(b);
    }

    class test implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b) {
                x = Integer.parseInt(t1.getText());
                y = Integer.parseInt(t2.getText());
                z = x + y;
                t3.setText(String.valueOf(z));
            }
        }
    }

}