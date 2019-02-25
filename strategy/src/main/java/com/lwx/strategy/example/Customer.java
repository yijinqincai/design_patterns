package com.lwx.strategy.example;

/**
 * Created with IntelliJ IDEA.
 * Description: 顾客类
 * User: lwx
 * Date: 2019-02-24
 * Time: 21:11
 */
public class Customer {
    //总价格
    private double totalPrice;
    //顾客类型
    private int type;

    public Customer(double totalPrice, int type) {
        this.totalPrice = totalPrice;
        this.type = type;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
