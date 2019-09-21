package com.hxjc.springboot.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * filter可以拦截jsp,而拦截器拦截不了jsp,拦截器只能拦截controller
 * creater: 13116
 * create time: 2019/9/18
 * describe:springboot中使用filter
 * 1、通过注解方式实现；编写一个Servlet3的注解过滤器
 * 2、在main方法的主类上添加注解：@ServletComponentScan(basePackages = "com.hxjc.springboot.filter")
 */
@WebFilter(urlPatterns = "/*")  // /*:表示所有请求路径都过滤
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("您已进入filter过滤器，您的请求正常，请继续。。。");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
