package com.springaop.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author suyiming3333@gmail.com
 * @version V1.0
 * @Title: Demo
 * @Package com.springaop.demo
 * @Description: TODO
 * @date 2019/12/4 23:09
 */
public class Demo {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        PrintService proxy = applicationContext.getBean("printerProxy",PrintService.class);
        proxy.print("test");
    }
}
