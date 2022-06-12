package structual.bridge.lect;

import java.awt.*;

public class BlueColorShape implements ColorShape{
    @Override
    public void setColor(Graphics graphics) {
        graphics.setColor(Color.BLUE);
    }
}
