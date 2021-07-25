package pl.pcz.weatherapp.weather;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.pcz.weatherapp.weather.photo.WeatherPhoto;

import java.util.List;

@Data
@AllArgsConstructor
public class Weather {

    private String city;
    private WeatherStats stats;
    private List<WeatherPhoto> photos;

}
