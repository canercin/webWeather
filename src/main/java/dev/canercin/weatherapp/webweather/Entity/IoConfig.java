package dev.canercin.weatherapp.webweather.Entity;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "dev.canercin.weatherapp.webweather")
public class IoConfig {
    public WeatherInfo weatherInfo(){
        return new WeatherInfo(null);
    }
}
