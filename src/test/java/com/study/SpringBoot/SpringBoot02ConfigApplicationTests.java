package com.study.SpringBoot;
import com.study.SpringBoot.beans.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * SpringBoot单元测试;
 *
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的功能
 * 该测试类的路径需要与 标注的 @SpringBootApplication 主类的路径一致，不然无法进行相关bean的注入
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {
	Logger logger = LoggerFactory.getLogger(getClass()); //日志记录器
	@Autowired
	Person person;

	@Autowired
	ApplicationContext ioc;

	@Test
	public void testHelloService(){
		boolean b = ioc.containsBean("helloService02");
		System.out.println(b);
	}
	//测试SpringBoot日志
	@Test
	public void testLogging(){
		//日志级别  由低到高 trace《debug《info《warn《error
		//可以调整日志的输出级别  日志就会只会在这个级别与以后的高级别打印
		logger.trace("这是trace日志");
		logger.debug("这是debug 日志");
		//SpringBoot 默认使用的日志级别是 info级别的
		logger.info("这是info日志");
		logger.warn("这是warn警告日志");
		logger.error("这是异常日志");
	}


	@Test
	public void contextLoads() {
		System.out.println(person);
	}

}
