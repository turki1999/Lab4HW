import java.awt.*;

public class Q4 {
    public static void main(String[] args) {
        Rectangle box=new Rectangle(5,10,20,30);
        box.add(0,0);
        System.out.println("The expected result (0,0,25,40)");
        System.out.println("The value after adding"+box);
        System.out.println(box.getWidth());
        System.out.println(box.getHeight());


    }
}
