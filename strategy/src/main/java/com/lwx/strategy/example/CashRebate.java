package com.lwx.strategy.example;

/**
 * Created with IntelliJ IDEA.
 * Description: 打折收费实现类
 * User: lwx
 * Date: 2019-02-24
 * Time: 20:16
 */
@CustomerType(type = 2) //会员顾客
public class CashRebate implements CashSuper {

    private double moneyRebate = 1d;

    //打折收费，初始化时，必需要输入折扣率，如八折就是0.8，为了方便用反射所以参数给了数组
    public CashRebate(double... parameters) {
        this.moneyRebate = parameters[0];
    }

    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
