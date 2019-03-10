package com.lwx.prototype;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-03-10
 * Time: 11:51
 */
public class Student implements Cloneable {

    private String name;
    private int age;

    private School school;

    public Student() {
        this.school = new School();
        school.setName("xx学校");
        school.setAddress("xx市xx路");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    protected Student clone()  {
        Student student = null;
        try {
            student = (Student) super.clone();
            student.school = school.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
