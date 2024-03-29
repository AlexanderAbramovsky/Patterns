package Observer.MyImplementation;

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.removeObserver(null);

        weatherData.setMeasurements(60, 32, 1f);
    }
}
