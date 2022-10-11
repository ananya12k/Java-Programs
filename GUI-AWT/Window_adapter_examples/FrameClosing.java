import java.awt.*;
import java.awt.event.*;

public class FrameClosing extends Frame {
    FrameClosing() {
        setVisible(true);
        setSize(500, 500);
        setTitle("Frame Closing demo");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        FrameClosing f = new FrameClosing();
    }
}
