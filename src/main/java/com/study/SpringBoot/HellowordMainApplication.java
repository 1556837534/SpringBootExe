package com.study.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ceshi
 * @Title: SpringBoot HelloWorld 启动主程序
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/4/615:23
 */

/**
 *  @SpringBootApplication 来标注一个SpringBoot 主程序  说明这是一个SpringBoot 应用 该注解标注在某一类上，说明该类是SpringBoot的主配置类
 *  SpringBoot 就会运行该类的main方法来启动SpringBoot 应用
 */
@SpringBootApplication
public class HellowordMainApplication {
    public static void main(String[] args) {
        //启动 Spring 应用
        SpringApplication.run(HellowordMainApplication.class,args);
    }
}
