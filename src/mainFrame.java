//Group 5
//IST 240
//Prof Fisher

////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////// Final/////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class mainFrame extends JFrame implements ActionListener {

    gameP gameP;
    mainPanel screenP;
    mainMenu menuP;

    public mainFrame() {
        super("Main Menu");

        menuP = new mainMenu();
        screenP = new mainPanel(menuP);
        gameP = new gameP(screenP);

        setLayout(new BorderLayout());

        menuP.setLayout(new BoxLayout(menuP, BoxLayout.PAGE_AXIS));
        menuP.add(Box.createRigidArea(new Dimension(20,20)));
        menuP.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        getContentPane().add(gameP, "Center");
        getContentPane().add(screenP, "Center");
        getContentPane().add(menuP, "West");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);
        setVisible(true);

        menuP.b5.addActionListener(this);
        gameP.gameOver.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == menuP.b5) {
            screenP.setVisible(false);
            menuP.setVisible(false);
            gameP.setVisible(true);
            getContentPane().setLayout(new BorderLayout());
            getContentPane().add(gameP, "Center");
            gameP.resetGame();
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(640, 480);
        }

        if (obj == gameP.gameOver) {
            gameP.setVisible(false);
            screenP.setVisible(true);
            menuP.setVisible(true);
        }
    }
}
