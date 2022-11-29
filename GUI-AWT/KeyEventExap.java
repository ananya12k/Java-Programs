import java.awt.*;
import java.awt.event.*;
import java.util.StringTokenizer;

public class KeyEventExap extends Frame implements KeyListener {
    Label l1=new Label("Words: ");
    Label l2=new Label("Characters: ");
    TextArea ta =new TextArea();
    Panel p1=new Panel();
    Panel p2=new Panel();
    KeyEventExap() {
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        add(p1);
        add(p2);
        p1.add(l1);
        p1.add(l2);
        p2.add(ta);
        ta.addKeyListener(this);
    }

    public void keyPressed(KeyEvent k) {

    }

    public void keyReleased(KeyEvent k) {
        String text=ta.getText();
        int word=0,chars=0;
        StringTokenizer st =new StringTokenizer(text," ");
            word+=st.countTokens();
            l1.setText("Words: "+word);
            chars+=text.length();
            l2.setText("Characters: "+chars);
    }

    public void keyTyped(KeyEvent k) {

    }

    public static void main(String[] args) {
        KeyEventExap kk =new KeyEventExap();
    }
}