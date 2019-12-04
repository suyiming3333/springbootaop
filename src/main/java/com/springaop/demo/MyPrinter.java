package com.springaop.demo;

import org.springframework.stereotype.Service;

/**
 * @author suyiming3333@gmail.com
 * @version V1.0
 * @Title: MyPrinter
 * @Package com.springaop.demo
 * @Description: TODO
 * @date 2019/12/4 22:47
 */

@Service
public class MyPrinter implements PrintService {
    @Override
    public void print(String str) {
        System.out.println("printing..."+str);
    }
}
