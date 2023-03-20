package dev.canercin.weatherapp.webweather.dao;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import dev.canercin.weatherapp.webweather.Entity.WeatherInfo;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Repository
public class WeatherData implements IWeatherData{

    WeatherInfo info;


    public WeatherData(WeatherInfo info) throws UnirestException, ParseException {
        JsonNode jsonNode = getJson(info.getCityName()).getBody();
        this.info.setCityName(jsonNode.getObject().get("city").toString());
        this.info.setDescription(jsonNode.getObject().getJSONArray("result").getJSONObject(0).get("description").toString());
        this.info.setDay(jsonNode.getObject().getJSONArray("result").getJSONObject(0).get("day").toString());
        this.info.setDegree(Double.parseDouble(jsonNode.getObject().getJSONArray("result").getJSONObject(0).get("degree").toString()));
        this.info.setDate(new SimpleDateFormat("dd.MM.yyyy").parse(jsonNode.getObject().getJSONArray("result").getJSONObject(0).get("date").toString()));
    }

    public static HttpResponse<JsonNode> getJson(String city) throws UnirestException {
        return Unirest.get("https://api.collectapi.com/weather/getWeather?data.lang=tr&data.city="+city)
                .header("content-type", "application/json")
                .header("authorization", "apikey 2KT8v5DnICb2CTYfy9yOK4:3dxqap8KrKuKIMoKb5Jzz1")
                .asJson();
    }

    public String getCityName() {
        return info.getCityName();
    }
    public void setCityName(String cityName) {
        info.setCityName(cityName);
    }

    public String getDescription() {
        return info.getDescription();
    }

    public String getDay() {
        return info.getDay();
    }

    public double getDegree() {
        return info.getDegree();
    }

    public Date getDate() {
        return info.getDate();
    }
}
