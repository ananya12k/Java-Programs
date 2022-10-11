import java.awt.*;
import java.awt.event.*;

class CardLayoutexample extends Frame implements ActionListener {
    Button B1 = new Button("Next");
    Button B2 = new Button("Prev");
    Button B3 = new Button("Last");
    CardLayout card = new CardLayout();

    CardLayoutexample() {
        setLayout(card);
        setVisible(true);
        setTitle("Card layout");
        setSize(500, 500);
        add(B1);
        add(B2);
        add(B3);
        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        card.next(this);
    }

    public static void main(String[] args) {
        CardLayoutexample c1 = new CardLayoutexample();
    }
}
