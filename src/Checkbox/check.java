package Checkbox;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.GridLayout;
import java.awt.TextField;

import org.w3c.dom.events.Event;

public class check extends Applet {
    Checkbox c1, c2, c3, c4;
    TextField t;

    public void init() {
        c1 = new Checkbox("1");
        c2 = new Checkbox("2");
        c3 = new Checkbox("3");
        c4 = new Checkbox("4");
        t = new TextField(15);
        setLayout(new GridLayout(5, 1));
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(t);
    }

    public Boolean action(Event e, Object o) {
        int sum = 0;
        if (c1.getState())
            sum = sum + 1;
        if (c1.getState())
            sum = sum + 2;
        if (c1.getState())
            sum = sum + 3;
        if (c1.getState())
            sum = sum + 4;
        t.setText(String.valueOf(sum));
        return true;
    }

}
