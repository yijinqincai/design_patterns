package com.lwx.observer.example;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-03
 * Time: 22:32
 */
public class ConcreteObserver implements Observer {

    private String name;
    private String state;
    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void update() {
        state = subject.getState();
        System.out.println("观察者：" + name + "的新状态是" + state);
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}
