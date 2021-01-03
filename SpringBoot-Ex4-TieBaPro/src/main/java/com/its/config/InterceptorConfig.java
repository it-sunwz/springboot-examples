package com.its.config;

import com.its.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    //先通过@Bean方式注册拦截器
    @Bean
    public LoginInterceptor loginInterceptor(){
        LoginInterceptor loginInterceptor = new LoginInterceptor();
        return loginInterceptor;
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //通过registry去注册一个实例，并且添加拦截路径 /**多级匹配
        registry.addInterceptor(this.loginInterceptor()).addPathPatterns("/**");
    }
}
