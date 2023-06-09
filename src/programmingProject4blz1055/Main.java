package programmingProject4blz1055;

import opdracht5.FirstWindow;

import javax.swing.*;

/**
 * Create a class named as Driving. The constructor of this class will contain two
 * buttons and two labels. The buttons will be displayed with the caption ‘Yes’ and
 * ‘No’. The first label object will contain the text ‘Are you an excellent driver?’ If the
 * user clicks ‘Yes’, the first label should change to ‘We need you!’ If the user clicks
 * ‘No’, the first label should change to ‘You need to practice!’ The second label shows
 * how many users respond with ‘Yes’ and how many users respond with ‘No’
 */
public class Main extends JFrame {
    public static void main(String[] args) {

        var w = new View();
        Driving d = new Driving();
        w.viewFrame(d.driverPanel());
    }
}
