package com.lwx.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * Description: 读者类，要实现观察者接口
 * User: lwx
 * Date: 2019-04-01
 * Time: 23:21
 */
public class Reader implements Observer {

    private String name;

    public Reader(String name) {
        this.name = name;
    }

    //读者可以关注某一位作者，关注则代表把自己加到作者的观察者列表里
    public void subscribe(String writerName) {
        WriterManager.getInstance().getWriter(writerName).addObserver(this);
    }

    //读者可以取消关注某一位作者，取消关注代表把自己从作者的观察者列表里删除
    public void unsubscribe(String writerName) {
        WriterManager.getInstance().getWriter(writerName).deleteObserver(this);
    }

    //当关注的作者发表新小说时，会通知读者去看
    public void update(Observable o, Object arg) {
        if (o instanceof Writer) {
            Writer writer = (Writer) o;
            System.out.println(name + "知道" + writer.getName() + "发布了新书《" + writer.getLastNovel() + "》，非要去看！");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
