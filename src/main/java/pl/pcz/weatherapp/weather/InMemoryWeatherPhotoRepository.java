package pl.pcz.weatherapp.weather;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InMemoryWeatherPhotoRepository implements WeatherPhotoRepository {

    private static Map<Long, WeatherPhoto> weatherPhotos = new HashMap<>();

    static {
        weatherPhotos.put(1L, new WeatherPhoto("https://bi.im-g.pl/im/81/4d/16/z23387777Q,Wielka-ulewa-w-Lodzi.jpg", "Lodz"));
        weatherPhotos.put(2L, new WeatherPhoto("https://visitwroclaw.eu/files/news/wroclaw_panorama1_1.jpg", "Wroclaw"));
        weatherPhotos.put(3L, new WeatherPhoto("https://bi.im-g.pl/im/a5/8a/11/z18391717V,Pogoda-w-Warszawie--Burza.jpg", "Warszawa"));
        weatherPhotos.put(4L, new WeatherPhoto("https://instytutsprawobywatelskich.pl/wp-content/uploads/2020/04/Kocham-%C5%81%C3%B3d%C5%BA-1160x652.jpg", "Lodz"));
    }

    @Override
    public WeatherPhoto getById(Long id) {
        return weatherPhotos.get(id);
    }

    @Override
    public List<WeatherPhoto> findByCity(String city) {
        return weatherPhotos.values().stream()
                .filter(w -> w.getCity().equals(city))
                .collect(Collectors.toList());
    }

    @Override
    public void save(WeatherPhoto photo) {
        weatherPhotos.put(weatherPhotos.size() + 1L, photo);
    }
}

