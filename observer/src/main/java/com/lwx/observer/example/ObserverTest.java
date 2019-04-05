package com.lwx.observer.example;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-03
 * Time: 22:34
 */
public class ObserverTest {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver("小明", subject));
        subject.attach(new ConcreteObserver("小红", subject));
        subject.setState("ABC");
        subject.change();
    }

}
