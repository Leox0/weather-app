package pl.pcz.weatherapp.weather.photo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherPhoto {

    private String url;
    private String city;

}