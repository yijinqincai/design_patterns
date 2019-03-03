package com.lwx.decorator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-02-27
 * Time: 21:19
 */
public class Decorator implements Component {

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    //重写operation方法，实际执行的是Component类中的operation方法
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
