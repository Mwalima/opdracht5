package programmingProject4blz1055;

import javax.swing.*;

public class View extends JFrame{
        private static final int WIDTH = 600;
        private static final int HEIGHT = 400;

        public JComponent getGui(JPanel panel) {
        return panel;
    }
        public JFrame viewFrame(JPanel panel) {
            Main form = new Main();
            form.setSize(WIDTH, HEIGHT);
            form.setTitle("Driving Check");
            form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            form.setLocationRelativeTo(null);
            form.getContentPane().add(getGui(panel));
            form.setVisible(true);
            return form;
        }
    }

