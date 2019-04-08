package com.lwx.state.example;

/**
 * Created with IntelliJ IDEA.
 * Description: 晚间工作状态
 * User: lwx
 * Date: 2019-04-08
 * Time: 21:45
 */
public class EveningState implements WorkState {

    @Override
    public void writeProgram(Work work) {
        if (work.getFinish() == null ? Boolean.FALSE : work.getFinish()) {
            //完成任务，转入下班状态
            work.setWorkState(new RestState());
            work.writeProgram();
        } else {
            if (work.getHour() < 21) {
                System.out.println("当前时间：" + work.getHour() + "点 加班哦，疲劳至极。");
            } else {
                //超过21点则转入睡眠工作状态
                work.setWorkState(new SleepingState());
                work.writeProgram();
            }
        }
    }

}
