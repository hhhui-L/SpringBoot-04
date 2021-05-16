package com.example.webadmin.config;

import com.example.webadmin.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 1、编写一个拦截器实现HandlerInterceptor接口
 * 2、拦截器注册到容器中（实现WebMvcConfigurer的addInterceptors方法）
 * 3、指定拦截规则【如果是拦截所有，静态资源也会被拦截】
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                // 添加要拦截的，/**指拦截所有请求，包括静态资源
                .addPathPatterns("/**")
                // 添加要放行的页面
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**"); // 放行静态资源第一种方法
                // 方法2：在application.properties中配置静态资源的访问路径为/static/**
    }
}

