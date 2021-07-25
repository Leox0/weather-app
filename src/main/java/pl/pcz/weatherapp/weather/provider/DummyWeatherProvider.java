package pl.pcz.weatherapp.weather.provider;

import pl.pcz.weatherapp.weather.WeatherStats;

import java.util.HashMap;
import java.util.Map;

public class DummyWeatherProvider implements WeatherProvider {

    private static Map<String, WeatherStats> weathers = new HashMap<>();

    static {
        weathers.put("Lodz", new WeatherStats(2.0));
        weathers.put("Warszawa", new WeatherStats(4.0));
    }

    @Override
    public WeatherStats forecast(String city) {
        return weathers.getOrDefault(city, new WeatherStats(-100.0));
    }
}
