package com.lwx.strategy.example;

/**
 * Created with IntelliJ IDEA.
 * Description: 现金收费接口
 * User: lwx
 * Date: 2019-02-24
 * Time: 20:12
 */
public interface CashSuper {

    /**
     * 收取现金
     * @param money 原价
     * @return 当前价
     */
    double acceptCash(double money);

}

