package com.lwx.state.example;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-08
 * Time: 21:32
 */
public class Work {

    private WorkState workState;
    // 钟点 属性，状态转化的依据
    private Integer hour;
    // 任务完成 属性，能下班的依据
    private Boolean finish;

    public Work() {
        //工作初始化为上午工作状态，即上午9点开始上班
        this.workState = new ForenoonState();
    }

    public void writeProgram() {
        workState.writeProgram(this);
    }

    public Boolean getFinish() {
        return finish;
    }

    public void setFinish(Boolean finish) {
        this.finish = finish;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public WorkState getWorkState() {
        return workState;
    }

    public void setWorkState(WorkState workState) {
        this.workState = workState;
    }
}
