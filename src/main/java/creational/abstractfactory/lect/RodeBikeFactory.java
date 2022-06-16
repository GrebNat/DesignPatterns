package creational.abstractfactory.lect;

public class RodeBikeFactory extends BikeFactory{
    @Override
    Tire createTire() {
        return new  RodeBikeTire();
    }

    @Override
    Handlebar createHandlebar() {
        return new RodeBikeHandleBar();
    }
}
