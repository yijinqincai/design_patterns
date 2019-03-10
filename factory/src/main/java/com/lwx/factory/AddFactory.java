package com.lwx.factory;

/**
 * Created with IntelliJ IDEA.
 * Description: 加法类工厂
 * User: lwx
 * Date: 2019-03-09
 * Time: 21:16
 */
public class AddFactory implements Factory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }

}
