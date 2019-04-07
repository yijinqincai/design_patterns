package com.lwx.abstract_factory.example;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-07
 * Time: 17:59
 */
public class DivFactory implements Factory {

    @Override
    public Operation createOperation() {
        return new ConcreteOperationDiv();
    }

}
