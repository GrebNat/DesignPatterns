package creational.factory.lect;

public class HandCandyFactory extends CandyFactory {

    @Override
    public Candy getCandy(String section) {
        switch (section) {
            case "cansycone":
                return new HandCandy_candycane();
            case "lollipop":
                return new HandCandy_lollipop();
            case "peppermint":
                return new HandCandy_peppermint();
            default:
                return new HandCandy_peppermint();
        }
    }
}
