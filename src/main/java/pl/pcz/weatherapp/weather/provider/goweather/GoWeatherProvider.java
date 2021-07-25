package pl.pcz.weatherapp.weather.provider.goweather;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import pl.pcz.weatherapp.weather.WeatherStats;
import pl.pcz.weatherapp.weather.provider.WeatherProvider;

public class GoWeatherProvider implements WeatherProvider {

    public static final String GO_WEATHER_BASE_PATH = "https://goweather.herokuapp.com/weather/";
    RestTemplate restTemplate = new RestTemplate();

    @Override
    public WeatherStats forecast() {
        return getWeather("Lodz");
    }

    @Override
    public WeatherStats forecast(String city) {
        return getWeather(city);
    }

    private WeatherStats getWeather(String city) {
        String fooResourceUrl = GO_WEATHER_BASE_PATH + city;
        ResponseEntity<GoWeatherResponse> response
                = restTemplate.getForEntity(fooResourceUrl, GoWeatherResponse.class);

        return new WeatherStats(response.getBody().getTemperatureFormatted());
    }
}
