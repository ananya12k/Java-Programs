import java.awt.*;
import java.awt.event.*;;

class nullLayout extends Frame
{
    nullLayout()
    {
        setSize(500,500);
        setVisible(true);
        Button B1=new Button("Button");
        add("South",B1);//adds button to the south of the frame
    }
    public static void main(String[] args) {
        nullLayout n=new nullLayout();
    }
}