package com.hxjc.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement //开启springboot事务支持
@ServletComponentScan(basePackages = {"com.hxjc.springboot.servlet","com.hxjc.springboot.filter"}) //springboot中使用Servlet,filter
public class Application {

	public static void main(String[] args) {
		//启动了springboot程序，启动spring容器，启动内嵌的tomcat
		SpringApplication.run(Application.class, args);
	}
}
