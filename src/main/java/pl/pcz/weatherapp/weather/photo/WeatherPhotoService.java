package pl.pcz.weatherapp.weather.photo;

public class WeatherPhotoService {
    private final WeatherPhotoRepository weatherPhotoRepository;

    public WeatherPhotoService(WeatherPhotoRepository weatherPhotoRepository) {
        this.weatherPhotoRepository = weatherPhotoRepository;
    }

}
