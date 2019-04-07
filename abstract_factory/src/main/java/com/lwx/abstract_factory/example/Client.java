package com.lwx.abstract_factory.example;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-07
 * Time: 17:59
 */
public class Client {

    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        Factory factory = null;

        factory  = new AddFactory();
        Operation addOperation = factory.createOperation();
        System.out.println("加法：" + addOperation.getResult(a, b));

        factory  = new SubFactory();
        Operation subOperation = factory.createOperation();
        System.out.println("减法：" + subOperation.getResult(a, b));

        factory  = new MulFactory();
        Operation mulOperation = factory.createOperation();
        System.out.println("乘法：" + mulOperation.getResult(a, b));

        factory  = new DivFactory();
        Operation divOperation = factory.createOperation();
        System.out.println("除法：" + divOperation.getResult(a, b));

    }

}
