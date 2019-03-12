package com.lwx.template_method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-03-11
 * Time: 22:00
 */
public class Test {

    public static void main(String[] args) {
        TestPaper testPaper = null;

        System.out.println("学生A答题");
        testPaper = new StudentAPaper();
        testPaper.answerQuestion();

        System.out.println("----------------------------");

        System.out.println("学生B答题");
        testPaper = new StudentBPaper();
        testPaper.answerQuestion();
    }

}
