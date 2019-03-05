package com.lwx.proxy.example;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description: 目标对象拦截器
 * User: lwx
 * Date: 2019-03-04
 * Time: 21:48
 */
public class CglibInterceptor implements MethodInterceptor {

    /**
     * 重写方法拦截在方法前后加入业务
     * @param o 目标对象
     * @param method 目标方法
     * @param objects 参数
     * @param methodProxy CGlib方法代理对象
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        long startTime = System.currentTimeMillis();
        result = methodProxy.invokeSuper(o, objects);
        long endTime = System.currentTimeMillis();
        System.out.println("方法耗费时间：" + (endTime - startTime));
        System.out.println("实例化" + o.getClass().getName() + "，并调用了" + method.getName() + "方法。");
        return result;
    }

}
