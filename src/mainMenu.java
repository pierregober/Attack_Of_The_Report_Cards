//Group 5
//IST 240
//Prof Fisher

////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////// Final/////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import javax.swing.*;

public class mainMenu extends JPanel {

    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    title la1;

    public mainMenu() {
        super();

        setBackground(Color.blue);

        b1 = new JButton("Info");
        b1.setBackground(Color.white);
        b1.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.yellow, 5),
                BorderFactory.createLineBorder(Color.white, 7)));
        b2 = new JButton("Team Members");
        b2.setBackground(Color.white);
        b2.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.red, 5),
                BorderFactory.createLineBorder(Color.white, 7)));
        b3 = new JButton("Options");
        b3.setBackground(Color.white);
        b3.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.magenta, 5),
                BorderFactory.createLineBorder(Color.WHITE, 7)));
        b4 = new JButton("How to Play");
        b4.setBackground(Color.white);
        b4.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.gray, 5),
                BorderFactory.createLineBorder(Color.white, 7)));
        b5 = new JButton("Start Game");
        b5.setBackground(Color.white);
        b5.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.blue, 5),
                BorderFactory.createLineBorder(Color.white, 7)));
        b6 = new JButton("Scores");
        b6.setBackground(Color.white);
        b6.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.green, 5),
                BorderFactory.createLineBorder(Color.white, 7)));
        la1 = new title(" IST240 Group 5 ");

        add(la1);
        add(b1);
        add(b2);
        add(b4);
        add(b3);
        add(b5);
        add(b6);

    }
}
