package com.hxjc.springboot.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * creater: 13116
 * create time: 2019/9/18
 * describe:springboot中使用Servlet
 * 1、通过注解方式实现；使用Servlet3的注解方式编写一个Servlet
 * 2、在main方法的主类上添加注解：@ServletComponentScan(basePackages = "com.hxjc.springboot.servlet")
 */
@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("my servlet hello world");
        resp.getWriter().flush();
        resp.getWriter().close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
