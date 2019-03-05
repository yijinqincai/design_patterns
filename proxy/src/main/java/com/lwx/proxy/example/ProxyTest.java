package com.lwx.proxy.example;

import com.lwx.proxy.RealSubject;
import com.lwx.proxy.Subject;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-03-04
 * Time: 21:33
 */
public class ProxyTest {

    public static void main(String[] args) {
        ProxyHandler proxyHandler = new ProxyHandler();
        Subject subject = (Subject) proxyHandler.bind(new RealSubject());
        subject.request();
    }

}
