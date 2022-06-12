package structual.decorator.lect;

import java.awt.*;

public class ComponentWithRedBorder implements Component {

    Component decoratedComponent;

    public ComponentWithRedBorder(Component decoratedComponent) {
        this.decoratedComponent = decoratedComponent;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.red);
        decoratedComponent.draw(graphics );
        graphics.setColor(Color.black);
    }
}
