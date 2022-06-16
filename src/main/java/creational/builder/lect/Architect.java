package creational.builder.lect;

import java.awt.*;

public class Architect {

    public static void main(String[] args) {

        new Bedroom()
                .setCellingHeight(4)
                .setFloorNumber(4)
                .setWallColor(Color.RED);
    }
}
