package p15.Latihan1ke1;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm1 extends JFrame {
    private JLabel label; // 2

    // 3
    public HelloWorldForm1() {
        label = new JLabel();
        label.setText("Helloworld!");

        add(label);
        setTitle("My First Program");

        setVisible(true);
        setSize(300, 200);
    }
}
