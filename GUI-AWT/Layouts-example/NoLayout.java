import java.awt.*;
import java.awt.event.*;

class NoLayout extends Frame implements ActionListener {
    String str;
    Button B1 = new Button("First");
    Button B2 = new Button("Second");
    Button B3 = new Button("Third");
    Button B4 = new Button("Fourth");

    NoLayout() {
        setVisible(true);
        setLayout(null);
        setTitle("No Layout");
        setSize(500, 500);
        B1.setBounds(40, 50, 70, 100);
        B2.setBounds(150, 50, 70, 100);
        B3.setBounds(250, 50, 70, 100);
        B4.setBounds(350, 50, 70, 100);
        add(B1);
        add(B2);
        add(B3);
        add(B4);
        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == B1) {
            str = B1.getLabel();
            repaint();
        }
        if (ae.getSource() == B2) {
            str = B2.getLabel();
            repaint();
        }
        if (ae.getSource() == B3) {
            str = B3.getLabel();
            repaint();
        }
        if (ae.getSource() == B4) {
            str = B4.getLabel();
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString("This is " + str + " button", 100, 300);
    }

    public static void main(String[] args) {
        NoLayout nl = new NoLayout();
    }
}
