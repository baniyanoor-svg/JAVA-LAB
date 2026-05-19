// Program for event handling

import java.awt.*;
import java.awt.event.*;

class EventDemo extends Frame implements ActionListener {

    Button b;

    EventDemo() {

        b = new Button("Click");

        // button position
        b.setBounds(100, 100, 80, 40);

        add(b);

        // action listener
        b.addActionListener(this);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        // button click message
        System.out.println("Button Clicked");
    }

    public static void main(String args[]) {

        new EventDemo();
    }
}
