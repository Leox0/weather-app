package pl.pcz.weatherapp.weather;

import java.util.HashMap;
import java.util.Map;

public class InMemoryWeatherPhotoRepository implements WeatherPhotoRepository {

    private static Map<Long, WeatherPhoto> weatherPhotos = new HashMap<>();

    static {
        weatherPhotos.put(1L, new WeatherPhoto("https://bi.im-g.pl/im/81/4d/16/z23387777Q,Wielka-ulewa-w-Lodzi.jpg", "Lodz"));
        weatherPhotos.put(2L, new WeatherPhoto("https://visitwroclaw.eu/files/news/wroclaw_panorama1_1.jpg", "Wroclaw"));
        weatherPhotos.put(3L, new WeatherPhoto("https://bi.im-g.pl/im/a5/8a/11/z18391717V,Pogoda-w-Warszawie--Burza.jpg", "Warsaw"));
    }

    @Override
    public WeatherPhoto getById(Long id) {
        return weatherPhotos.get(id);
    }
}
