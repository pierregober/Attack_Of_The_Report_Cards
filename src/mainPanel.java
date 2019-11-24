import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class mainPanel extends JPanel implements ActionListener {

    JLabel l; 
    JLabel l2;
    JLabel l2a; 
    JLabel l3; 
    JLabel l4; 
    JLabel l5; 
    JLabel l6; 
    JLabel l7; 
    JLabel l8;
    JLabel l9;
    JLabel l10;
    JLabel l11; 

    JPanel p2; 
    JPanel p3; 
    JPanel p4; 
    JPanel p5; 
    JPanel p6; 
    JPanel p7; 
    
    
    String testScore; 
    JLabel lPlayer; 
    JTextField player; 
    JLabel lDifficulty; 
    String[] difficultyLevel = new String[]{"Easy", "Normal", "Heroic", "Legendary"};
    JComboBox difficulty = new JComboBox(difficultyLevel);

    Timer tim;
    int counter = 3;
            
    mainMenu mainin;
    mainFrame mainFrame;
    
    int p2Check;
    int p3Check;
    int p4Check;
    int p5Check;
    int p6Check;
    int p7Check;
   

    JButton save; 
      
    public mainPanel(mainMenu informedPanel) {
        super();
        setBackground(Color.white);
        
        testScore = "Last Score is: ";
     
        mainin = informedPanel;
        
        p2Check = 0;
        p3Check = 0;
        p4Check = 0;
        p5Check = 0;
        p6Check = 0;
        p7Check = 0;
      
        
        p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.PAGE_AXIS));
        p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3, BoxLayout.PAGE_AXIS));
        p4 = new JPanel();
        p4.setLayout(new BoxLayout(p4, BoxLayout.PAGE_AXIS));
        p5 = new JPanel();
        p5.setLayout(new BoxLayout(p5, BoxLayout.PAGE_AXIS));
        p6 = new JPanel();
        p6.setLayout(new BoxLayout(p6, BoxLayout.PAGE_AXIS));
        p7 = new JPanel();
        p7.setLayout(new BoxLayout(p7, BoxLayout.PAGE_AXIS));
       
        mainin.b1.addActionListener(this);
        mainin.b2.addActionListener(this);
        mainin.b3.addActionListener(this);
        mainin.b4.addActionListener(this);
        mainin.b5.addActionListener(this);
        mainin.b6.addActionListener(this);
     
       
        
        
        
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        l = new JLabel();
        l2 = new JLabel();
        l2a = new JLabel();
        l3 = new JLabel();
        l4 = new JLabel();
        l5 = new JLabel();
        l6 = new JLabel();
        l7 = new JLabel();
        l8 = new JLabel();
        l9 = new JLabel();
        l10 = new JLabel();
     
        lDifficulty = new JLabel();
        lPlayer = new JLabel();
        player = new JTextField(20);
        save= new JButton("SAVE");
        save.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == mainin.b1) {
            if (p2Check != 1) {
                remove(p3);
                p3Check = 0;
                remove(p4);
                p4Check = 0;
                remove(p5);
                p5Check = 0;
                remove(p6);
                p6Check = 0;
                remove(p7);
                p7Check = 0;
               
                
                revalidate();
                repaint();
            }
            add(p2);
            p2.add(l);
            p2.add(l2);
            p2.add(l2a);
            l.setText("IST 240 - Final Project - Group 5 - Eplison");
            l2.setText("You are Wade Watts you need to Destroy all the Fs!");
            l2a.setText("The fate of our future is in your hands!");
            p2Check = 1;

        }
        
        ////Team menu////
        if (obj == mainin.b2) {
            if (p3Check != 1) {
                remove(p2);
                p2Check = 0;
                remove(p4);
                p4Check = 0;
                remove(p5);
                p5Check = 0;
                remove(p6);
                p6Check = 0;
                remove(p7);
                p7Check = 0;
               
                revalidate();
                repaint();
            }
            add(p3);
            p3.add(l3);
            p3.add(l5);
            p3.add(l7);
            p3.add(l9);
            l3.setText("Pierre");
            l5.setText("Tim");
            l7.setText("Yaeyoung");
            l9.setText("Mike Wazowski");
            p3Check = 1;
        }
        

        if (obj == mainin.b3) {
            if (p4Check != 1) {
                remove(p2);
                p2Check = 0;
                remove(p3);
                p3Check = 0;
                remove(p5);
                p5Check = 0;
                remove(p6);
                p6Check = 0;
                remove(p7);
                p7Check = 0;
         
                
                revalidate();
                repaint();
            }
            add(p4);
            p4.add(l6);
            l6.setText("Select Game Options");

        
            lPlayer.setText("Player Name");
            p4.add(lPlayer);

          
            player.setToolTipText("Enter Name");
            p4.add(player);

         
            lDifficulty.setText("Select Difficulty"); 
            p4.add(lDifficulty);
            p4.add(difficulty);
            p4.add(save); 
            
            persistObject persist= new persistObject();

            Object ob =persist.readObject();
            opt o= new opt();
            if(opt.class.isInstance(ob))
                o= (opt) ob;

            player.setText(o.getName());
            difficulty.setSelectedItem(o.getDifficulty());
            persist.writeObject(o);

            p4Check = 1;
        }
        if (obj == save) {
            persistObject persist= new persistObject();
            opt o=new opt();
            o.setName(player.getText());
            o.setDifficulty((String)difficulty.getSelectedItem());
            persist.writeObject(o);
        }

        if (obj == mainin.b4) {
            if (p5Check != 1) {
                remove(p2);
                p2Check = 0;
                remove(p3);
                p3Check = 0;
                remove(p4);
                p4Check = 0;
                remove(p6);
                p6Check = 0;
                remove(p7);
                p7Check = 0;
                
                
                revalidate();
                repaint();
            }
            add(p5);
            p5.add(l6);
            p5.add(l8);
            l6.setText("Spacebar to jump");
            l8.setText("Yhe left and right arrow keys to move and down arrow to attack");
            p5Check = 1;
        }
        
        //// Scores menu////
        if (obj == mainin.b6) {
            if (p6Check != 1) {
                remove(p2);
                p2Check = 0;
                remove(p3);
                p3Check = 0;
                remove(p4);
                p4Check = 0;
                remove(p5);
                p5Check = 0;
                remove(p6);
                p6Check = 0;
                remove(p7);
                p7Check = 0;
               
                
                revalidate();
                repaint();
            }
            add(p7);
            p7.add(l11);
            score mainScore=new score();
            p7.add(mainScore.displayXML());
            p7Check = 1;
        }

        if (obj == tim){
            if (counter == 0){
                tim.stop();
                l10.setText("BEGIN!");
                counter = 3;
                return;
            }
            l10.setText("Begin in:"+counter);
            counter--;
        }
    }
}