package com.lwx.factory;

/**
 * Created with IntelliJ IDEA.
 * Description: 运算工厂类
 * User: lwx
 * Date: 2019-03-09
 * Time: 21:06
 */
public class OperationFactory {

    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }

}
