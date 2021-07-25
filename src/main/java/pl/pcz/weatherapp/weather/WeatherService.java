package pl.pcz.weatherapp.weather;

import org.springframework.stereotype.Service;
import pl.pcz.weatherapp.weather.photo.WeatherPhoto;
import pl.pcz.weatherapp.weather.photo.WeatherPhotoService;
import pl.pcz.weatherapp.weather.provider.WeatherProvider;
import pl.pcz.weatherapp.weather.provider.goweather.GoWeatherProvider;

import java.util.List;

@Service
public class WeatherService {

    private final WeatherProvider weatherProvider;
    private final WeatherPhotoService weatherPhotoService;

    public WeatherService(WeatherPhotoService weatherPhotoService) {
        this.weatherPhotoService = weatherPhotoService;
        this.weatherProvider = new GoWeatherProvider();
    }

    public Weather getWeather() {
        String defaultCity = "Lodz";
        return createCity(defaultCity);
    }

    public Weather getWeather(String city) {
        return createCity(city);
    }

    private Weather createCity(String city) {
        WeatherStats stats = weatherProvider.forecast(city);
        List<WeatherPhoto> photos = weatherPhotoService.findByCity(city);
        return new Weather(city, stats, photos);
    }

    public void addWeatherPhoto(WeatherPhoto photo) {
        weatherPhotoService.save(photo);
    }

}
