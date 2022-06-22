import java.applet.Applet;
import java.awt.CheckboxGroup;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.Panel;


public class radio extends Applet {

    Panel1 p1;
    Panel2 p2;

    public void init(){
        
        //Set overall layout of the applet
        setLayout(new GridLayout(1,2));

        p1 = new Panel1();
        p2 = new Panel2();


        add(p1);
        add(p2);

    }
    public boolean action(Event e, Object o) {

        if (p1.cb1.getState()){
            p2.cb1.setState(true);
            p2.cb2.setState(true);
            p2.cb3.setState(false);
            p2.tf.setText("3000");
        }

        if (p1.cb2.getState()){
            p2.cb1.setState(false);
            p2.cb2.setState(true);
            p2.cb3.setState(true);
            p2.tf.setText("6000");
        }

        if (p1.cb3.getState()){
            p2.cb1.setState(true);
            p2.cb2.setState(false);
            p2.cb3.setState(true);
            p2.tf.setText("9000");
        }

        return false;
    }

}

class Panel1 extends Panel {
    CheckboxGroup cbg;
    Checkbox cb1, cb2,cb3;

    public Panel1(){
        setLayout(new GridLayout(3,1));
        cbg = new CheckboxGroup();
        cb1 = new Checkbox("Tour 1", cbg, false);
        cb2 = new Checkbox("Tour 2", cbg, false);
        cb3 = new Checkbox("Tour 3", cbg, false);

        add(cb1);
        add(cb2);
        add(cb3);
    }
}

class Panel2 extends Panel {
    Checkbox cb1, cb2,cb3;
    TextField tf;

    public Panel2(){
        setLayout(new GridLayout(4,1));

        cb1 = new Checkbox("Manali", false);
        cb2 = new Checkbox("Shimla", false);
        cb3 = new Checkbox("Dehradun", false);
        tf = new TextField();

        add(cb1);
        add(cb2);
        add(cb3);
        add(tf);
    }
}
