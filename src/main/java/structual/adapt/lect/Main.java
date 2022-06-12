package structual.adapt.lect;

public class Main {
    public static void main(String[] args) {
        CarPriceCalculation carPriceCalculation = new CarPriceCalculation(3, "Ford");
        printVehiclePrice(carPriceCalculation);

        TrackPriceCalculation trackPriceCalculation = new TrackPriceCalculation(10, 0);
        printVehiclePrice(trackPriceCalculation);

        UKCarPriceCalculator ukCarPriceCalculator = new UKCarPriceCalculator("mazda", 3);
        printVehiclePrice(new Adapter(ukCarPriceCalculator));
    }

    private static void printVehiclePrice(PriceCalculation priceCalculation) {
        String price = priceCalculation.calculatePrice();
        System.out.println("price is "+ price);
    }
}
