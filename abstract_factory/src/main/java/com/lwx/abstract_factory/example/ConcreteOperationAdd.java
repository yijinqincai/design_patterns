package com.lwx.abstract_factory.example;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-07
 * Time: 17:45
 */
public class ConcreteOperationAdd implements OperationAdd {

    @Override
    public double getResult(double a, double b) {
        return a + b;
    }

}
