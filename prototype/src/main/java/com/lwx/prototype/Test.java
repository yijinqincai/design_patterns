package com.lwx.prototype;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-03-10
 * Time: 11:57
 */
public class Test {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("小明");
        student1.setAge(18);
        System.out.println(student1.toString());

        Student student2 = student1.clone();
        System.out.println(student2.toString());
    }

}
