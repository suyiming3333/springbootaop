package com.springaop.demo;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * @author suyiming3333@gmail.com
 * @version V1.0
 * @Title: RoundAdvice
 * @Package com.springaop.demo
 * @Description: TODO
 * @date 2019/12/4 22:48
 */

@Component
public class RoundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Roundadvice方法执行前");
        System.out.println(methodInvocation.getArguments()[0]);//可以获取目标方法的参数值
        Object result=methodInvocation.proceed();//调用目标对象的方法
        System.out.println("RoundAdvice方法执行完成了");
        return result;
    }
}
