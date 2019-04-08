package com.lwx.state.example;

/**
 * Created with IntelliJ IDEA.
 * Description: 上午工作状态
 * User: lwx
 * Date: 2019-04-08
 * Time: 21:32
 */
public class ForenoonState implements WorkState {

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间：" + work.getHour() + "点 上午工作，精神百倍。");
        } else {
            //超过12点，则转入中午工作状态
            work.setWorkState(new NoonState());
            work.writeProgram();
        }
    }
}
