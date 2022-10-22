import javax.swing.*;
import java.awt.*;
public class Q7D {
    public void paintComponent(Graphics a)
    {
        Rectangle r=new Rectangle(100,100,100,100);
        Graphics2D a2=(Graphics2D) a;
        a2.fill(r);
        Rectangle squares1=new Rectangle(25,25,200,200);
        a2.setColor(Color.pink);
        a2.fill(squares1);
        Rectangle squares2=new Rectangle(300,25,200,200);
        a2.setColor(Color.magenta);
        a2.fill(squares2);

    }
}
