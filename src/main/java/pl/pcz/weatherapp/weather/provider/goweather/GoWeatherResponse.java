package pl.pcz.weatherapp.weather.provider.goweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GoWeatherResponse {

    String temperature;

    public double getTemperatureFormatted() {
        return Double.valueOf(temperature.split(" ")[0].replace("+", ""));
    }
}
