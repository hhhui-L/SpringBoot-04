package com.example.webadmin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.webadmin.bean.User;
import org.springframework.stereotype.Service;

/**
 * IService:Service的总接口，顶级Service接口
 * 泛型：即Service要查询哪些数据类型 ---> 查找User类型的数据接口
 *
 */
@Service
public interface UserService extends IService<User> {
}
