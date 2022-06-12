package structual.adapt.exec;

public class Main {
    public static void main(String[] args) {

        WeatherWarning weatherWarning = new WeatherWarning();

        NorthAmericanCity chicago = new NorthAmericanCity("Chicago", 16);
        weatherWarning.postWarning(chicago);

        AsiaCity bangkok = new AsiaCity("Bankok", 50);
        weatherWarning.postWarning(new Adapter(bangkok));

    }
}
