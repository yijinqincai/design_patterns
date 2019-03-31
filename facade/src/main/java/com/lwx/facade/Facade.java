package com.lwx.facade;

/**
 * Created with IntelliJ IDEA.
 * Description: 外观类
 * User: lwx
 * Date: 2019-03-31
 * Time: 11:05
 */
public class Facade {

    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;
    private SubSystemFour subSystemFour;

    public Facade() {
        this.subSystemOne = new SubSystemOne();
        this.subSystemTwo = new SubSystemTwo();
        this.subSystemThree = new SubSystemThree();
        this.subSystemFour = new SubSystemFour();
    }

    public void methodsA() {
        System.out.println("方法组A");
        subSystemOne.method1();
        subSystemTwo.method2();
        subSystemFour.method4();
    }

    public void methodsB() {
        System.out.println("方法组B");
        subSystemTwo.method2();
        subSystemThree.method3();
    }

}
