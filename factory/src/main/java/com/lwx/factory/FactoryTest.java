package com.lwx.factory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-03-09
 * Time: 21:58
 */
public class FactoryTest {

    public static void main(String[] args) {
        Factory factory = new DivFactory();
        Operation operation = factory.createOperation();
        operation.numberA = 8;
        operation.numberB = 10;
        System.out.println(operation.getResult());
    }

}
