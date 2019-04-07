package com.lwx.abstract_factory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-07
 * Time: 16:23
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }

}
