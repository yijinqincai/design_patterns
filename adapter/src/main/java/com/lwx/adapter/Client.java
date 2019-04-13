package com.lwx.adapter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-13
 * Time: 18:38
 */
public class Client {

    public static void main(String[] args) {
        Robot bioRobot = new BioRobot();
        bioRobot.cry();
        bioRobot.move();
        Robot dogAdapter = new DogAdapter(new Dog());
        dogAdapter.cry();
        dogAdapter.move();
    }

}
