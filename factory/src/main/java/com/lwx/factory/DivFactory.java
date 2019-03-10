package com.lwx.factory;

/**
 * Created with IntelliJ IDEA.
 * Description: 除法工厂类
 * User: lwx
 * Date: 2019-03-09
 * Time: 21:19
 */
public class DivFactory implements Factory {

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }

}
