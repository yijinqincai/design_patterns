package com.lwx.proxy;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-03-03
 * Time: 17:44
 */
public class RealSubject implements Subject {

    public void request() {
        System.out.println("真实的请求");
        try {
            //用一个随机睡眠模仿处理业务逻辑
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
