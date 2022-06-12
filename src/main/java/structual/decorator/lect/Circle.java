package structual.decorator.lect;

import java.awt.*;

public class Circle implements Component {

    int x, y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawOval(x, y, 50, 50);
    }
}
