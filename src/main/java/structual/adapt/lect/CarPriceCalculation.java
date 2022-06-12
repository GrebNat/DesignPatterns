package structual.adapt.lect;

public class CarPriceCalculation implements PriceCalculation{

    private int age;
    private String model;
    public static int averageCarPrice = 6000;

    public CarPriceCalculation(int age, String model) {
        this.age = age;
        this.model = model;
    }

    public int getRetainPrice(){
        switch (model){
            case  "Ford":
                return 3000;
            default:
                return averageCarPrice;
        }
    }


    @Override
    public String calculatePrice() {
        return getRetainPrice() + "USD";
    }
}
