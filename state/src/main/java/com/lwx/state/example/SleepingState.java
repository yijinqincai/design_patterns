package com.lwx.state.example;

/**
 * Created with IntelliJ IDEA.
 * Description: 睡眠状态
 * User: lwx
 * Date: 2019-04-08
 * Time: 21:46
 */
public class SleepingState implements WorkState {

    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间：" + work.getHour() + "点 不行了，睡着了。");
    }

}
