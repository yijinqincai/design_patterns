package com.lwx.factory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-03-09
 * Time: 20:59
 */
public class OperationTest {

    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
        operation.numberA = 5;
        operation.numberB = 10;
        System.out.println(operation.getResult());
    }

}
