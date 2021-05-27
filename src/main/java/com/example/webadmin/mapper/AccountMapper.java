package com.example.webadmin.mapper;

import com.example.webadmin.bean.Account;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface AccountMapper {

    // 按照id查找一个用户信息
    public Account getAcct(Long id);

}
