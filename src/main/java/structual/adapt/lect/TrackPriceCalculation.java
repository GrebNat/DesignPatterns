package structual.adapt.lect;

public class TrackPriceCalculation implements PriceCalculation{

    private int age;
    private int millage;
    public static int averageCarPrice = 10000;

    public TrackPriceCalculation(int age, int millage) {
        this.age = age;
        this.millage = millage;
    }

    @Override
    public String calculatePrice() {
        int price = Math.max(averageCarPrice- age*100 - millage/100, 0);
        return price + "USD";
    }
}
