package creational.builder.lect;

import java.awt.*;

public class Bedroom {
    Dimension dimension;
    int cellingHeight;
    int floorNumber;
    Color wallColor;
    int numberOfWindows;
    int numberOfDoors;


    public Bedroom setDimension(Dimension dimension) {
        this.dimension = dimension;
        return this;
    }

    public Bedroom setCellingHeight(int cellingHeight) {
        this.cellingHeight = cellingHeight;
        return this;
    }

    public Bedroom setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    public Bedroom setWallColor(Color wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    public Bedroom setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public Bedroom setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }
}
