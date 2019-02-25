package com.lwx.strategy.example;

/**
 * Created with IntelliJ IDEA.
 * Description: 正常收费实现类
 * User: lwx
 * Date: 2019-02-24
 * Time: 20:14
 */
@CustomerType //普通顾客
public class CashNormal implements CashSuper {

    //正常收费，原价返回
    public double acceptCash(double money) {
        return money;
    }
}
