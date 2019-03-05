package com.lwx.proxy.example;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-03-05
 * Time: 21:11
 */
public class CglibTest {

    public static void main(String[] args) {
        //Enhancer是CGLIB中的字节码增强器，它可以方便的对你想要代理的类进行扩展
        Enhancer enhancer = new Enhancer();
        //设置代理目标
        enhancer.setSuperclass(CglibObject.class);
        //设置回调
        enhancer.setCallback(new CglibInterceptor());
        //动态生成一个代理类，并从Object强制转型成父类型CglibObject
        CglibObject cglibObject = (CglibObject) enhancer.create();
        //在代理类上调用方法
        cglibObject.function();
    }

}
