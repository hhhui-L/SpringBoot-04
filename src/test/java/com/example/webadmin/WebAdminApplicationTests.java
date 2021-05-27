package com.example.webadmin;

import com.example.webadmin.bean.User;
import com.example.webadmin.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class WebAdminApplicationTests {

    // 因为容器中存在JdbcTemplate组件，只需要使用@Autowired自动注入即可
    // @Autowired 自动注入
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {

        // 将查询结果封装为Object
//        jdbcTemplate.queryForObject("select * from account_tb1");
        // 将查询结果封装为List
//        jdbcTemplate.queryForList("select * from account_tb1")
        // 统计表里的记录条数
        Long aLong = jdbcTemplate.queryForObject("select count(*) from account_tb1", Long.class);
        log.info("记录总数：{}",aLong);
        log.info("数据源类型：{}",dataSource.getClass());
    }

    @Test
    void testUserMapper(){
        User user = userMapper.selectById(1L);
        log.info("用户信息：{}",user);
    }

}
