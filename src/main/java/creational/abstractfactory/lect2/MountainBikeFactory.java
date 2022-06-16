package creational.abstractfactory.lect2;

public class MountainBikeFactory extends BikeFactory {

    @Override
    public BikePark create(String type) {
        if (type.equalsIgnoreCase("tire"))
            return new MountainBikeTire();
        else if (type.equalsIgnoreCase("handlear"))
            return new MountainBikeHandleBar();
        else
            return null;
    }
}
