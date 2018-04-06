package com.study.SpringBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ceshi
 * @Title:  HelloWorld Controller
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/4/615:28
 */
@Controller
public class HelloController {
    /**
     * 启动 HelloWorldMainApplication 主程序后 直接在浏览器中访问 http://localhost:8080/hello 即可
     * 服务器上可以不安装 tomcat的环境
     */
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello World";
    }
}
