package pl.pcz.weatherapp.weather.provider.goweather;


import org.junit.jupiter.api.Test;
import pl.pcz.weatherapp.weather.WeatherStats;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GoWeatherProviderTest {
    @Test
    public void consume() {
        GoWeatherProvider goWeatherProvider = new GoWeatherProvider();

        WeatherStats forecast = goWeatherProvider.forecast("Lodz");
        assertNotNull(forecast);
    }

}
