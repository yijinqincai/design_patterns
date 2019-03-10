package com.lwx.factory;

/**
 * Created with IntelliJ IDEA.
 * Description: 除法实现类
 * User: lwx
 * Date: 2019-03-09
 * Time: 20:51
 */
public class OperationDiv extends Operation {

    double getResult() {
        if (numberB == 0){
            throw new ArithmeticException("除数不能为0");
        }
        return numberA / numberB;
    }

}
