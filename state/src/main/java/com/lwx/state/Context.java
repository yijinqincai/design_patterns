package com.lwx.state;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-08
 * Time: 21:24
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态：" + state.getClass().getName());
    }

    public void request() {
        state.handle(this);
    }

}
