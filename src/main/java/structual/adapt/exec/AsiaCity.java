package structual.adapt.exec;

public class AsiaCity implements City{

    private String name;
    private double temperature;
    private boolean hasWeatherWarning;

    public AsiaCity(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
        this.hasWeatherWarning = false;
    }

    @Override
    public double getTemperature() {
        return this.temperature;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getTemperatureScale() {
        return "Celsius";
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        this.hasWeatherWarning = hasWeatherWarning;
    }

    @Override
    public boolean getHasWeatherWarning() {
        return this.hasWeatherWarning;
    }
}
