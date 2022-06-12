package structual.adapt.exec;

public class Adapter implements City {

    AsiaCity asiaCity;

    public Adapter(AsiaCity asiaCity) {
        this.asiaCity = asiaCity;
    }

    @Override
    public double getTemperature() {
        return asiaCity.getTemperature() * 1.8 + 32;
    }

    @Override
    public String getName() {
        return asiaCity.getName();
    }

    @Override
    public String getTemperatureScale() {
        return "Fahrenheit";
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        asiaCity.setHasWeatherWarning(hasWeatherWarning);
    }

    @Override
    public boolean getHasWeatherWarning() {
        return asiaCity.getHasWeatherWarning();
    }
}
