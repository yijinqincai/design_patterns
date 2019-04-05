package com.lwx.observer.listener;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-03
 * Time: 23:15
 */
public class Reader implements WriterListener {

    private String name;

    public Reader(String name) {
        this.name = name;
    }

    //读者可以关注某一位作者，关注则代表把自己加到作者的监听器列表里
    public void subscribe(String writerName) {
        WriterManager.getInstance().getWriter(writerName).registerListener(this);
    }

    //读者可以取消关注某一位作者，取消关注则代表把自己从作者的监听器列表里注销
    public void unsubscribe(String writerName) {
        WriterManager.getInstance().getWriter(writerName).unregisterListener(this);
    }

    public void addNovel(WriterEvent writerEvent) {
        Writer writer = writerEvent.getWriter();
        System.out.println(name+"知道" + writer.getName() + "发布了新书《" + writer.getLastNovel() + "》，非要去看！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
