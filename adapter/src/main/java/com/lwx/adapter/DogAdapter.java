package com.lwx.adapter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-13
 * Time: 18:37
 */
public class DogAdapter implements Robot {

    private Dog dog;

    public DogAdapter(Dog dog) {
        this.dog = dog;
    }

    public void cry() {
        System.out.print("机器人模仿：");
        dog.shout();
    }

    public void move() {
        System.out.print("机器人模仿：");
        dog.run();
    }
}
