
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class player1 extends JButton {

    ImageIcon char_stand; // image icon of standing character
    ImageIcon char_standL; // image icon of standing character left
    ImageIcon char_right; // image of moving right
    ImageIcon char_left; // image of moving left
    opt opt;

    player1() {
        super();

        char_stand = new ImageIcon("images/stand_down.png");
        char_standL = new ImageIcon("images/shoot_down.png");
        char_right = new ImageIcon("images/walk_left.png");
        char_left = new ImageIcon("images/walk_right.png");

        setIcon(char_stand);
        setBorderPainted(false); // remove button border

        persistObject persist = new persistObject();

        Object o = persist.readObject();
        opt = new opt();
        if (opt.class.isInstance(o)) {
            opt = (opt) o;
        }
    }

    public void setName(String n) {
        opt.setName(n);
    }

    public String getName() {
        return opt.getName();
    }

    public void setDifficulty(String d) {
        opt.setDifficulty(d);
    }

    public String getDifficulty() {
        return opt.getDifficulty();
    }

    void setIconR() {
        setIcon(char_right);
    }

    void setIconL() {
        setIcon(char_left);
    }

    void setIconStand() {
        setIcon(char_stand);
    }

    void setIconStandL() {
        setIcon(char_standL);
    }

    public void setScore(int s) {
        opt.setScore(s);
    }

    public int getScore() {
        return opt.getScore();
    }

    public opt getOptions() {
        return this.opt;
    }
}
