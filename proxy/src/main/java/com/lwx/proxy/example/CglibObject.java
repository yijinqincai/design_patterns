package com.lwx.proxy.example;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-03-05
 * Time: 21:42
 */
public class CglibObject {

    public void function() {
        System.out.println("调用function方法");
        try {
            //用一个随机睡眠模仿处理业务逻辑
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
