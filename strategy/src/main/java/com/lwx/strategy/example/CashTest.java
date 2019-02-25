package com.lwx.strategy.example;

/**
 * Created with IntelliJ IDEA.
 * Description: 测试类
 * User: lwx
 * Date: 2019-02-24
 * Time: 20:29
 */
public class CashTest {

    public static void main(String[] args) {
        CashContext cashContext = null;
        Customer customer = null;

        customer = new Customer(500, 1);
        cashContext = new CashContext(customer);
        System.out.println("普通顾客花费500，最后需支付的价格：" + cashContext.getResult());

        customer = new Customer(500, 2);
        cashContext = new CashContext(customer, 0.8);
        System.out.println("会员顾客花费500，最后需支付的价格：" + cashContext.getResult());

        customer = new Customer(500, 3);
        cashContext = new CashContext(customer, 0.8 , 300, 100);
        System.out.println("超级会员顾客花费500，最后需支付的价格：" + cashContext.getResult());

    }

}
