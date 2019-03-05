package com.lwx.proxy.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-03-04
 * Time: 21:23
 */
public class ProxyHandler implements InvocationHandler {

    //绑定委托对象，并返回代理类
    private Object target;

    public Object bind(Object target) {
        //绑定该实现的所有接口，取得代理类
        this.target = target;
        /**
         * 第一个参数：类加载器
         * 第二个参数：代理需要实现的接口，可以有点多个
         * 第三个参数：方法调用的实际处理者
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        long startTime = System.currentTimeMillis();
        //在调用invoke()方法的前后可以进行所谓的AOP编程，这里我们就简单的打印一下方法调用所花费的时间和代理对象调用方法的名称
        result = method.invoke(target, args);
        long endTime = System.currentTimeMillis();
        System.out.println("方法耗费时间：" + (endTime - startTime));
        System.out.println("实例化" + target.getClass().getName() + "，并调用了" + method.getName() + "方法。");
        return result;
    }

}
