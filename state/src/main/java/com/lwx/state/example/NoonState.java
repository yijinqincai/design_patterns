package com.lwx.state.example;


/**
 * Created with IntelliJ IDEA.
 * Description: 中午工作状态
 * User: lwx
 * Date: 2019-04-08
 * Time: 21:39
 */
public class NoonState implements WorkState {

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println("当前时间：" + work.getHour() + "点 饿了，午饭；犯困，午休。");
        } else {
            //超过13点，转入下午工作状态
            work.setWorkState(new AfternoonState());
            work.writeProgram();
        }
    }

}
