package creational.abstractfactory.lect2;

public class RodeBikeFactory extends BikeFactory {

    @Override
    public BikePark create(String type) {
        if (type.equalsIgnoreCase("tire"))
            return new RodeBikeTire();
        else if (type.equalsIgnoreCase("handlear"))
            return new RodeBikeHandleBar();
        else
            return null;
    }
}
