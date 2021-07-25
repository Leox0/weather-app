package pl.pcz.weatherapp.weather.provider;

import pl.pcz.weatherapp.weather.WeatherStats;

public interface WeatherProvider {
    WeatherStats forecast();
    WeatherStats forecast(String city);

}
