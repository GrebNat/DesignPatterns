package creational.abstractfactory.lect;

public class RodeBikeHandleBar extends Handlebar{
    public static final String type = "DROP";
    @Override
    void getDescription() {
        System.out.println("Road bike handlebar type: "+ type);
    }
}
