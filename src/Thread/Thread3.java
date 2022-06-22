package Thread;
// MULTI THREAD

import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class Thread3 extends Frame implements Runnable {

    TextField t1, t2;
    Thread th1, th2;
    int i, j;

    public static void main(String[] args) {
        new Thread3();
    }

    @Override
    public void run() {
        while (true) {
            Thread th = Thread.currentThread();
            if (th.equals(th1)) {
                t1.setText(String.valueOf(i));
                if (i == 1000)
                    i = 0;
                else
                    i++;
            }
            if (th.equals(th2)) {
                t2.setText(String.valueOf(j));
                if (j == 1000)
                    j = 0;
                else
                    j++;
            }
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }

    public Thread3() {
        setLayout(new FlowLayout());

        add(t1 = new TextField(20));
        add(t2 = new TextField(20));

        th1 = new Thread(this);
        th2 = new Thread(this);
        th1.start();
        th2.start();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(500, 500);
        setVisible(true);
    }
}
