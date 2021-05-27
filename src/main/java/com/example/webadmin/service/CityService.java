package com.example.webadmin.service;

import com.example.webadmin.bean.City;

public interface CityService {

    public City getById(Long id);
    public void saveCity(City city);
}
