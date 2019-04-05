package com.lwx.observer.listener;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-01
 * Time: 23:40
 */
public class Client {

    public static void main(String[] args) {
        //假设四个读者，俩个作者
        Reader r1 = new Reader("谢广坤");
        Reader r2 = new Reader("赵四");
        Reader r3 = new Reader("七哥");
        Reader r4 = new Reader("刘能");
        Writer w1 = new Writer("谢大脚");
        Writer w2 = new Writer("王小蒙");

        //四人关注了谢大脚
        r1.subscribe("谢大脚");
        r2.subscribe("谢大脚");
        r3.subscribe("谢大脚");
        r4.subscribe("谢大脚");
        //俩人关注了王小蒙
        r3.subscribe("王小蒙");
        r4.subscribe("王小蒙");

        //作者发布新书就会通知关注的作者
        w1.addNovel("设计模式");
        w2.addNovel("java变成思想");
        r1.unsubscribe("谢大脚");
        w1.addNovel("观察者模式");

    }

}
