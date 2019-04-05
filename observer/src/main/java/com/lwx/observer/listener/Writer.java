package com.lwx.observer.listener;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-03
 * Time: 23:02
 */
public class Writer {

    private String name; //作者名称

    private String lastNovel; //记录作者最新发布的小说

    //作者类要包含一个自己的监听器列表
    private Set<WriterListener> writerListeners = new HashSet<WriterListener>();

    public Writer(String name) {
        this.name = name;
        WriterManager.getInstance().add(this);
    }

    //作者发布新小说了，要通知所有关注自己的读者
    public void addNovel(String novel) {
        System.out.println(name + "发布了新书《" + novel + "》!");
        lastNovel = novel;
        fireEvent();
    }

    //触发发布新书的事件，通知所有监听这件事的监听器
    private void fireEvent() {
        WriterEvent writerEvent = new WriterEvent(this);
        for (WriterListener writerListener : writerListeners) {
            writerListener.addNovel(writerEvent);
        }
    }

    //提供给外部注册成为自己的监听器的方法
    public void registerListener(WriterListener writerListener) {
        writerListeners.add(writerListener);
    }

    //提供给外部注销的方法
    public void unregisterListener(WriterListener writerListener){
        writerListeners.remove(writerListener);
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

    public Set<WriterListener> getWriterListeners() {
        return writerListeners;
    }

    public void setWriterListeners(Set<WriterListener> writerListeners) {
        this.writerListeners = writerListeners;
    }
}
