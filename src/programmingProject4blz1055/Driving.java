package programmingProject4blz1055;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Create a class named as Driving. The constructor of this class will contain two
 * buttons and two labels. The buttons will be displayed with the caption ‘Yes’ and
 * ‘No’. The first label object will contain the text
 * ‘Are you an excellent driver?’ If the
 * user clicks ‘Yes’, the first label should change to
 * ‘We need you!’ If the user clicks
 * ‘No’, the first label should change to ‘You need to practice!’
 * The second label shows
 * how many users respond with ‘Yes’ and how many users respond with ‘No’
 */

public class Driving extends  JFrame implements ActionListener {

    private JButton yesButton,noButton;
    private JLabel noLabel, yesLabel;
    private int yescount,nocount;

    public Driving() {
    }

//    public Driving(JButton m_no, JButton m_yes, JLabel m_noLabel, JLabel m_yesLabel) {
//
//        this.noButton = m_no;
//        this.yesButton = m_yes;
//        this.noLabel = m_noLabel;
//        this.yesLabel = m_yesLabel;
//    }

    public JPanel driverPanel(){

        noLabel = new JLabel();
        String html = "<html><h1 style=\"font-size:14px;\">Are you an excellent driver?</h1></html>";
        noLabel.setText(html);
        noLabel.setForeground(new Color(10, 0, 0));
        noLabel.setBounds(200, 200, 170, 20);

        noButton = new JButton("No");
        noButton.setBounds(400, 400, 120, 25);
        noButton.setBackground(new Color(248, 3, 3));
        noButton.setForeground(new Color(191, 191, 191));


        yesLabel = new JLabel();
        String yeshtml = "<html><h1 style=\"font-size:14px;\">Total:</h1></html>";
        yesLabel.setText(yeshtml);
        yesLabel.setForeground(new Color(66, 107, 168));
        yesLabel.setBounds(600, 600, 170, 20);

        yesButton = new JButton("Yes");
        yesButton.setBounds(700, 700, 120, 25);
        yesButton.setBackground(new Color(57, 250, 4));
        yesButton.setForeground(Color.BLACK);

        noButton.addActionListener(this);
        yesButton.addActionListener(this);

        JPanel driveGridPanel = new JPanel(new GridLayout(2, 2));
        driveGridPanel.add(noLabel);
        driveGridPanel.add(noButton);
        driveGridPanel.add(yesLabel);
        driveGridPanel.add(yesButton);
        driveGridPanel.setBackground(new Color(255, 255, 255, 255));

        JPanel driverPanel = new JPanel();

        driverPanel.add(driveGridPanel, BorderLayout.CENTER);

        return driverPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == noButton){
            noButton.setText("You need to practice");
            nocount++;
            yesLabel.setText("Bad drivers:"+nocount);
            yesLabel.setBounds(200,500,200,100);
        }

        if(e.getSource() == yesButton){
            yesButton.setText("We need you!");
            yescount++;
            String  texkt = String.format("<html><h1 style=\"font-size:14px;\">Good drivers: %s!</h1></html>", yescount);

            yesLabel.setText(texkt);
            yesLabel.setBounds(500,500,200,100);
        }
    }
}
