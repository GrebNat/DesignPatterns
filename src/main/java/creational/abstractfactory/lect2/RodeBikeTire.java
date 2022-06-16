package creational.abstractfactory.lect2;

public class RodeBikeTire extends Tire {
    public static final String width = "NARROW";

    @Override
    void getDescription() {
        System.out.println("Road bike tire wight " + width);
    }
}
