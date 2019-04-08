package com.lwx.state.example;

/**
 * Created with IntelliJ IDEA.
 * Description: 下午工作状态
 * User: lwx
 * Date: 2019-04-08
 * Time: 21:43
 */
public class AfternoonState implements WorkState {

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.println("当前时间：" + work.getHour() + "点 下午状态还不错，继续努力。");
        } else {
            work.setWorkState(new EveningState());
            work.writeProgram();
        }
    }

}
