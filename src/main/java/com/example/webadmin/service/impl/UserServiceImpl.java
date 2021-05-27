package com.example.webadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.webadmin.bean.User;
import com.example.webadmin.mapper.UserMapper;
import com.example.webadmin.service.UserService;
import org.springframework.stereotype.Service;

/**
 * UserService没有规定什么方法，但是IService中有很多
 * 实现所有的方法会很麻烦，所有可以继承顶层接口IService的一个实现类ServiceImpl
 * ServiceImpl有两个泛型
 * 第一个是BaseMapper类型的，即当前的Service是要操作哪张表，使用哪一个Mapper ---> 此处为UserMapper
 * 第二个是操作表过后返回的数据类型 ---> 此处是User类型
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
