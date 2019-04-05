package com.lwx.observer;

import java.util.Observable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-01
 * Time: 23:28
 */
public class Writer extends Observable {

    private String name; //作者的名称

    private String lastNovel; //记录作者最新发布的小说

    public Writer(String name) {
        this.name = name;
        WriterManager.getInstance().add(this);
    }

    //作者发布新小说了，要通知所有关注自己的读者
    public void addNovel(String novel) {
        System.out.println(name + "发布了新书《" + novel + "》！");
        lastNovel = novel;
        setChanged();
        notifyObservers();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastNovel() {
        return lastNovel;
    }

    public void setLastNovel(String lastNovel) {
        this.lastNovel = lastNovel;
    }
}
