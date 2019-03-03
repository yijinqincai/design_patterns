package com.lwx.decorator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-02-27
 * Time: 21:21
 */
public class ConcreteDecoratorA extends Decorator {

    @Override
    public void operation() {
        super.operation();
        System.out.println("具体装饰对象A的操作");
    }
}
