package com.lwx.state;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-08
 * Time: 21:27
 */
public class ConcreteStateB implements State {

    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }

}

