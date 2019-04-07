package com.lwx.abstract_factory.example;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-07
 * Time: 17:49
 */
public class ConcreteOperationDiv implements OperationDiv{

    @Override
    public double getResult(double a, double b) {
        if (b == 0){
            throw new ArithmeticException("除数不能为0");
        }
        return a / b;
    }

}

