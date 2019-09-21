package com.hxjc.springboot.config;

import com.hxjc.springboot.intercepter.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * springboot 没有xml,@Configuration可以表示一个spring的xml配置文件
 * 比如：applicationContext.xml
 * creater: 13116
 * create time: 2019/9/18  springboot 使用拦截器
 * describe:编写配置类  @Configuration标注此类是一个配置类，让springboot扫描到
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //需要拦截的路径
        //  /boot/**:表示boot下的路径都拦截
        String[] addPathPatterns ={"/boot/**"};
        //不拦截的路径
        String[] excludePathPatterns ={"/boot/hello"};
        //注册登录拦截器
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }
}
