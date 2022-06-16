package creational.abstractfactory.lect;

public class BikeBuildre {
    public static void main(String[] args) {
        createBikeWithoutAbstractFactory();
        createBikeWithAbstractFactory("mountain bike");
    }

    private static void createBikeWithAbstractFactory(String type) {
        BikeFactory bikeFactory = FactoryCreator.createFactory(type);

        Tire tireFront = bikeFactory.createTire();
        Tire tireBack = bikeFactory.createTire();
        Handlebar handlebar = bikeFactory.createHandlebar();

        tireFront.getDescription();
        tireBack.getDescription();
        handlebar.getDescription();

        System.out.println();
    }

    private static void createBikeWithoutAbstractFactory() {
        MountainBikeTire mountainBikeTireFront = new MountainBikeTire();
        MountainBikeTire mountainBikeTireBack = new MountainBikeTire();

        MountainBikeHandleBar mountainBikeHandleBar = new MountainBikeHandleBar();

        mountainBikeTireFront.getDescription();
        mountainBikeTireBack.getDescription();
        mountainBikeHandleBar.getDescription();

        System.out.println();
    }
}
