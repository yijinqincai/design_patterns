package com.lwx.factory;

/**
 * Created with IntelliJ IDEA.
 * Description: 乘法工厂类
 * User: lwx
 * Date: 2019-03-09
 * Time: 21:18
 */
public class MulFactory implements Factory {

    @Override
    public Operation createOperation() {
        return new OperationMul();
    }

}
