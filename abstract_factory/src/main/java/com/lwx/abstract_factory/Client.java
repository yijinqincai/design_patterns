package com.lwx.abstract_factory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-07
 * Time: 16:25
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        factory1.createProductA().methodA();
        factory1.createProductB().methodB();

        AbstractFactory factory2 = new ConcreteFactory2();
        factory2.createProductA().methodA();
        factory2.createProductB().methodB();

    }

}
