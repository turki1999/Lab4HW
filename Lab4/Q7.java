import javax.swing.*;
import java.awt.*;
public class Q7 {
    public static void main(String[] args) {
        JFrame j=new JFrame();
        j.setSize(700,700);
        j.setVisible(true);
        j.setDefaultCloseOperation(j.getDefaultCloseOperation());
        Q7draw e=new Q7draw();
        j.add(e);
        j.setVisible(true);


    }

}
