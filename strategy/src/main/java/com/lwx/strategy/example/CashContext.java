package com.lwx.strategy.example;

/**
 * Created with IntelliJ IDEA.
 * Description: cash上下文类
 * User: lwx
 * Date: 2019-02-24
 * Time: 19:59
 */
public class CashContext {

    private CashSuper cashSuper = null;

    private Customer customer;

    public CashContext(Customer customer, double... parameters) {
        this.customer = customer;
        this.cashSuper = CashFactory.getInstance().createCashPush(customer, parameters);
    }

    public double getResult() {
        return cashSuper.acceptCash(customer.getTotalPrice());
    }

}
