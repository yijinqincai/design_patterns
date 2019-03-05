package com.lwx.proxy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-03-03
 * Time: 17:45
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    public void preRequest() {
        System.out.println("方法执行前");
    }

    public void afterRequest() {
        System.out.println("方法执行后");
    }

    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        afterRequest();
    }

}
