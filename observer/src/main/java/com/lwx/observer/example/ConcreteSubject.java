package com.lwx.observer.example;

/**
 * Created with IntelliJ IDEA.
 * Description: 具体通知者，将有关状态存入具体观察者对象；在具体主题的内部状态改变时，给所有登记过的观察者发出通知
 * User: lwx
 * Date: 2019-04-03
 * Time: 22:29
 */
public class ConcreteSubject extends Subject {

    //具体被观察者状态
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
