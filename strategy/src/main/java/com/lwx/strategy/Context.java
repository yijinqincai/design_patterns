package com.lwx.strategy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-02-24
 * Time: 16:19
 */
public class Context {

    private Strategy strategy;

    // 初始化时传入具体的策略对象
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //根据具体的策略对象，调用其算法的方法
    public void contextMethod() {
        strategy.algorithmMethod();
    }

}
