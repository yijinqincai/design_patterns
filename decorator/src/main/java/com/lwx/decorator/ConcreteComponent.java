package com.lwx.decorator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-02-27
 * Time: 21:18
 */
public class ConcreteComponent implements Component {

    public void operation() {
        System.out.println("具体的对象操作");
    }

}
