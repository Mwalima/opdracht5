package opdracht5;

import javax.swing.*;
import javax.swing.JButton;

public class FirstWindow extends JFrame{
        private static final int WIDTH = 300;

        private static final int HEIGHT = 200;

        public FirstWindow() {
        super();

        setSize(WIDTH, HEIGHT);
        setTitle("First Window Class");
        setDefaultCloseOperation(
                JFrame.DO_NOTHING_ON_CLOSE);
        JButton endButton = new JButton("Click to end program.");
        endButton.addActionListener(new EndingListener());
        add(endButton);
    }
}
