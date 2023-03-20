package dev.canercin.weatherapp.webweather.service;

import dev.canercin.weatherapp.webweather.dao.IWeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class WeatherService implements IWeatherService{
    private IWeatherData weatherData;
    @Autowired
    public WeatherService(IWeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public String getCityName() {
        return weatherData.getCityName();
    }
    public void setCityName(String cityName) {
         weatherData.setCityName(cityName);
    }

    @Override
    public String getDescription() {
        return weatherData.getDescription();
    }

    @Override
    public String getDay() {
        return weatherData.getDay();
    }

    @Override
    public double getDegree() {
        return weatherData.getDegree();
    }

    @Override
    public Date getDate() {
        return weatherData.getDate();
    }
}
