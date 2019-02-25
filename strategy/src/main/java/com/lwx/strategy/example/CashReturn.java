package com.lwx.strategy.example;

/**
 * Created with IntelliJ IDEA.
 * Description: 返利收子类
 * User: lwx
 * Date: 2019-02-24
 * Time: 20:19
 */
@CustomerType(type = 3) //超级会员
public class CashReturn implements CashSuper {

    private double moneyRebate = 1d;
    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;

    //返利收费子类，初始化时必须要输入折扣率、返利条件和返利值，为了方便用反射所以参数给了数组
    public CashReturn(double... parameters) {
        this.moneyRebate = parameters[0];
        this.moneyCondition = parameters[1];
        this.moneyReturn = parameters[2];
    }

    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            //超级会员先判断支付金额大于返利条件，则减去需要返利的值，再打折
            result = (money - Math.floor(money / moneyCondition) * moneyReturn) * moneyRebate;
        }
        return result;
    }
}
