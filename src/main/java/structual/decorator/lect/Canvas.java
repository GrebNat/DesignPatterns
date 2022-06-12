package structual.decorator.lect;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {

    Component component1 = new Circle(15, 15);
    Component component2 = new Circle(75, 15);
    Component component3 = new Circle(135, 15);

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.add(new Canvas());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paint(Graphics graphics){
        component1.draw(graphics);
        component2 = new ComponentWithRedBorder(component2);
        component2.draw(graphics);
        component3.draw(graphics);
    }
}
