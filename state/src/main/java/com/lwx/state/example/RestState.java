package com.lwx.state.example;

/**
 * Created with IntelliJ IDEA.
 * Description: 下班休息状态
 * User: lwx
 * Date: 2019-04-08
 * Time: 21:47
 */
public class RestState implements WorkState {

    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间：" + work.getHour() + "点 下班回家了。");
    }

}
