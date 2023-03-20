package dev.canercin.weatherapp.webweather.dao;

import java.util.Date;

public interface IWeatherData {
    String getCityName();
    String getDescription();
    String getDay();
    double getDegree();
    Date getDate();

    void setCityName(String cityName);
}
