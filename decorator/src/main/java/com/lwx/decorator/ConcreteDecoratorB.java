package com.lwx.decorator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-02-27
 * Time: 21:22
 */
public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior() {
        System.out.println("装饰对象B独有方法");
    }

}
