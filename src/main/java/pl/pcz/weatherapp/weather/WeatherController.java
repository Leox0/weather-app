package pl.pcz.weatherapp.weather;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @ModelAttribute
    public WeatherCriteria weatherCriteria(){
        return new WeatherCriteria();
    }

    @RequestMapping("")
    public String index(@ModelAttribute WeatherCriteria weatherCriteria, Model model){
        model.addAttribute("weather", weatherService.getWeather(weatherCriteria.getCity()));
        return "index";
    }

}
