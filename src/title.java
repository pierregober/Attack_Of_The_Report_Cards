
import javax.swing.JLabel;

public class title extends JLabel {

    String text;

    public title(String informedText) {
        super();
        text = informedText;
        setFont(new java.awt.Font("Monospaced", 1, 24));
        setForeground(new java.awt.Color(102, 100, 102));
        setText(text);
    }
}
