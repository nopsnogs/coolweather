package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Country extends DataSupport {

    private int id;
    private String countryName;
    private String weatherId;
    private int CityId;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCityId(int cityId) {
        CityId = cityId;
    }

    public int getCityId() {
        return CityId;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getWeatherId() {
        return weatherId;
    }
}

