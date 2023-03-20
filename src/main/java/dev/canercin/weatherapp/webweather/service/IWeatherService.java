package dev.canercin.weatherapp.webweather.service;

import java.util.Date;

public interface IWeatherService {
    String getCityName();
    String getDescription();
    String getDay();
    double getDegree();
    Date getDate();

    void setCityName(String name);
}
