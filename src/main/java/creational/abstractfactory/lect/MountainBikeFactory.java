package creational.abstractfactory.lect;

public class MountainBikeFactory extends BikeFactory{
    @Override
    Tire createTire() {
        return new MountainBikeTire();
    }

    @Override
    Handlebar createHandlebar() {
        return new MountainBikeHandleBar();
    }
}
