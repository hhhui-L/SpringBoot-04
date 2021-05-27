package com.example.webadmin.service.impl;

import com.example.webadmin.bean.City;
import com.example.webadmin.mapper.CityMapper;
import com.example.webadmin.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    // 注入CityMapper
    @Autowired
    CityMapper cityMapper;

    public City getById(Long id){

        return cityMapper.getById(id);

    }

    public void saveCity(City city){
        cityMapper.insert(city);
    }

}
