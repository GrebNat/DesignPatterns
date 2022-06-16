package creational.abstractfactory.lect;

public class MountainBikeHandleBar extends Handlebar{

    public static final String type = "FLAT";
    @Override
    void getDescription() {
        System.out.println("Mountain bike handlebar type: "+ type);
    }
}
