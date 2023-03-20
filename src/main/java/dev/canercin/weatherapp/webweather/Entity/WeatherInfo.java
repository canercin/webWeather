package dev.canercin.weatherapp.webweather.Entity;

import java.util.Date;

public class WeatherInfo {
    private String cityName;
    private String description;
    private String day;
    private double degree;
    private Date date;

    public WeatherInfo(String cityName) {
        this.cityName = cityName;
    }

    public WeatherInfo() {
    }

    public String getCityName() {
        return cityName;
    }

    public String getDescription() {
        return description;
    }

    public String getDay() {
        return day;
    }

    public double getDegree() {
        return degree;
    }

    public Date getDate() {
        return date;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
