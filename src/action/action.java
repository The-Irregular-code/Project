import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class action extends Applet {
    Button b1, b2;
    TextField t;

    public void init() {
        add(b1 = new Button("click"));
        add(b2 = new Button("clear"));
        add(t = new TextField(15));
        b1.addActionListener(new Q());
        b2.addActionListener(new P());
    }

    class P implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            t.setText("");
        }
    }

    class Q implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            t.setText("Hello");
        }
    }
}