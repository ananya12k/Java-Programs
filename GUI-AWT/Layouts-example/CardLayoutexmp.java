import java.awt.*;
import java.awt.event.*;

public class CardLayoutexmp extends Frame implements ActionListener {
    CardLayout cad = new CardLayout();
    Panel p1 = new Panel();
    Panel p2 = new Panel();
    Panel p3 = new Panel();
    Panel p4 = new Panel();
    Panel p5 = new Panel();
    Button B1 = new Button("Button 1 - Card 1");
    Button B2 = new Button("Button 2 - Card 1");
    Button B3 = new Button("First");
    Button B4 = new Button("Next");
    Button B5 = new Button("Previous");
    Button B6 = new Button("Last");
    TextField t = new TextField("Text Field on Card 2");

    CardLayoutexmp() {
        setSize(250, 250);
        setVisible(true);
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
        // Frame Has 2 Panels
        p1.setLayout(cad);
        p2.setLayout(new FlowLayout());
        p2.add(B3);
        p2.add(B4);
        p2.add(B5);
        p2.add(B6);

        // First Card
        p3.setBackground(Color.RED);
        p3.setLayout(new FlowLayout());
        p3.add(B1);
        p3.add(B2);

        // Second Card
        p4.setBackground(Color.green);
        p4.add(t);

        // Third Card
        p5.setBackground(Color.blue);

        p1.add("First Panel", p3);
        p1.add("Second Panel", p4);
        p1.add("Third Panel", p5);

        B3.addActionListener(this);
        B4.addActionListener(this);
        B5.addActionListener(this);
        B6.addActionListener(this);
    }

    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == B3) {
            cad.first(p1);
        } else if (a.getSource() == B4) {
            cad.next(p1);
        } else if (a.getSource() == B5) {
            cad.previous(p1);
        } else if (a.getSource() == B6) {
            cad.last(p1);
        }
    }

    public static void main(String[] args) {
        CardLayoutexmp c = new CardLayoutexmp();
    }
}
