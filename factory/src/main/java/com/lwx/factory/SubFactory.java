package com.lwx.factory;

/**
 * Created with IntelliJ IDEA.
 * Description: 减法工厂类
 * User: lwx
 * Date: 2019-03-09
 * Time: 21:17
 */
public class SubFactory implements Factory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }

}
