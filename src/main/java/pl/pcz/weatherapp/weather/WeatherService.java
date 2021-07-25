package pl.pcz.weatherapp.weather;

import org.springframework.stereotype.Service;
import pl.pcz.weatherapp.weather.provider.WeatherProvider;
import pl.pcz.weatherapp.weather.provider.goweather.GoWeatherProvider;

import java.util.ArrayList;

@Service
public class WeatherService {

    private final WeatherProvider weatherProvider;

    public WeatherService() {
        this.weatherProvider = new GoWeatherProvider();
    }

    public Weather getWeather() {
        WeatherStats stats = weatherProvider.forecast();
        return new Weather("Lodz",stats, new ArrayList<>());
    }

    public Weather getWeather(String city){
        WeatherStats stats = weatherProvider.forecast(city);
        return new Weather(city,stats, new ArrayList<>());
    }
}
