package structual.adapt.exec;

public interface City {
    double getTemperature();
    String getName();
    String getTemperatureScale();
    void setHasWeatherWarning(boolean hasWeatherWarning);
    boolean getHasWeatherWarning();
}
