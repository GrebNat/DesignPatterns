package creational.abstractfactory.lect2;

public class BikeBuildre {
    public static void main(String[] args) {
        createBikeWithExtensobleAbstractFactory("mountain bike");
    }

    private static void createBikeWithExtensobleAbstractFactory(String type) {
        BikeFactory bikeFactory = FactoryCreator.createFactory(type);

        Tire tireFront = (Tire) bikeFactory.create("tire");
        Tire tireBack = (Tire) bikeFactory.create("tire");
        Handlebar handlebar = (Handlebar) bikeFactory.create("handlear");

        tireFront.getDescription();
        tireBack.getDescription();
        handlebar.getDescription();

        System.out.println();
    }
}
