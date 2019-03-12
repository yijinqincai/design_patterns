package com.lwx.template_method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-03-11
 * Time: 22:49
 */
public class StudentAPaper extends TestPaper {

    @Override
    String answer1() {
        return "B";
    }

    @Override
    String answer2() {
        return "A";
    }

    @Override
    String answer3() {
        return "C";
    }
}
