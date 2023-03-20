package dev.canercin.weatherapp.webweather.controller;

import dev.canercin.weatherapp.webweather.service.IWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherAPI {
    private IWeatherService weatherService;

    @Autowired
    public WeatherAPI(IWeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{name}")
    public String getName(@PathVariable String name){
        weatherService.setCityName(name);
        return weatherService.getCityName();
    }
}
