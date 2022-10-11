import java.awt.*;
import java.awt.event.*;

class GridbagLayout extends Frame {
    Label l1 = new Label("Name: ");
    Label l2 = new Label("Address: ");
    TextField t1 = new TextField(15);
    TextField t2 = new TextField(6);

    GridbagLayout() {
        setLayout(new GridBagLayout());
        setVisible(true);
        setSize(500, 500);
        setTitle("Gridbag Layout");
        GridBagConstraints gc = new GridBagConstraints();
        add(l1, gc, 10, 1, 1, 1, 0, 0);
        add(t1, gc, 10, 20, 1, 1, 0, 10);
        add(l2, gc, 10, 40, 1, 1, 0, 10);
        add(t2, gc, 10, 60, 1, 1, 0, 10);
    }

    void add(Component c, GridBagConstraints gc, int x, int y, int w, int h, int wx, int wy) {
        gc.gridx = x;
        gc.gridy = y;
        gc.gridheight = h;
        gc.gridwidth = w;
        gc.weightx = wx;
        gc.weighty = wy;
        add(c, gc);

    }

    public static void main(String[] args) {
        GridbagLayout g1 = new GridbagLayout();
    }
}
