package com.example.webadmin.mapper;

import com.example.webadmin.bean.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

//@Mapper
public interface CityMapper {

    // 按照id查找一个城市的信息
    @Select("select * from city where id=#{id}")
    public City getById(Long id);

    @Insert("insert into  city(name,state,country) values(#{name},#{state},#{country})")
    @Options(useGeneratedKeys = true,keyProperty = "id")

    public void insert(City city);
}
