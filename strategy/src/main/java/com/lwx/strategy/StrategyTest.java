package com.lwx.strategy;

/**
 * Created with IntelliJ IDEA.
 * Description: 测试类
 * User: lwx
 * Date: 2019-02-24
 * Time: 16:20
 */
public class StrategyTest {

    public static void main(String[] args) {
        Context context;

        // 由于实例化不同的策略，所以最终调用context.contextMethod()时，所获得的结果就不尽相同
        context = new Context(new ConcreteStrategyA());
        context.contextMethod();

        context = new Context(new ConcreteStrategyB());
        context.contextMethod();

        context = new Context(new ConcreteStrategyC());
        context.contextMethod();

    }

}
