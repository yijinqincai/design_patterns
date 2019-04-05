package com.lwx.observer.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: 抽象通知者，保存对观察者对象的引用，提供增加和删除观察者的接口
 * User: lwx
 * Date: 2019-04-03
 * Time: 22:23
 */
public abstract class Subject {

    private List<Observer> observerList = new ArrayList<Observer>();

    //增加观察者
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    //移除观察者
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    //通知
    public void change() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

}
