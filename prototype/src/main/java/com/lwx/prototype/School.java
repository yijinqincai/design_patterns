package com.lwx.prototype;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-03-10
 * Time: 12:00
 */
public class School implements Cloneable{

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    protected School clone() {
        School school = null;
        try {
            school = (School) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return school;
    }
}
