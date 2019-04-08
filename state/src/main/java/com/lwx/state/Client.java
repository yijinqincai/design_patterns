package com.lwx.state;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-08
 * Time: 21:29
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();
        context.request();
    }

}
