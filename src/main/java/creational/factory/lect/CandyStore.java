package creational.factory.lect;

import java.util.ArrayList;

public class CandyStore {

    public static final ChocolateFactory chocolateFactory = new ChocolateFactory();
    public static final HandCandyFactory handCandyFactory = new HandCandyFactory();

    public static void main(String[] args) {
        chocolateFactory.getCandyPackage(2, "white");
        handCandyFactory.getCandyPackage(5, "lollipop");
    }
}
