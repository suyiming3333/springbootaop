package com.springaop.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private MyPrinter myPrinter;

    @Autowired
    private RoundAdvice roundAdvice;

    @Test
    public void contextLoads() {
    }

    @Test
    public void ProxyFactoryTest(){
        //使用代理工厂为目标对象创建代理，并织入我们自己的advice逻辑
        ProxyFactory proxyFactoryBean=new ProxyFactory();
        //设置代理目标
        proxyFactoryBean.setTarget(myPrinter);
        ////为代理目标对象织入增强
        proxyFactoryBean.addAdvice(roundAdvice);
        //获取代理对象
        PrintService proxy = (PrintService) proxyFactoryBean.getProxy();
        //代理对象执行方法
        proxy.print("suyiming3333");

    }

}
