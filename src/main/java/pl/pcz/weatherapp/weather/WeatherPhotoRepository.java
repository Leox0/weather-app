package pl.pcz.weatherapp.weather;

import java.util.List;

public interface WeatherPhotoRepository {
    WeatherPhoto getById(Long id);
    List<WeatherPhoto> findByCity(String city);
    void save(WeatherPhoto photo);

}
