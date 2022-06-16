package creational.abstractfactory.lect2;

public class FactoryCreator {

    public static BikeFactory createFactory(String type){

        if (type.equalsIgnoreCase("mountain bike")){
            return new MountainBikeFactory();
        }
        else if(type.equalsIgnoreCase("road bike")){
            return new RodeBikeFactory();
        }
        else {
            System.out.println("Please, specify a valid type");
            return null;
        }
    }
}
