package structual.adapt.lect;

public class UKCarPriceCalculator {

    private String model;
    public int age;

    public UKCarPriceCalculator(String model, int age) {
        this.model = model;
        this.age = age;
    }

    public int getPrice(){
        return 100; 
    }
}
