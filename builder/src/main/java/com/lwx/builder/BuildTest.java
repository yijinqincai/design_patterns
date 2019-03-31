package com.lwx.builder;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-03-31
 * Time: 20:55
 */
public class BuildTest {

    public static void main(String[] args) {
        Director director = new Director();
        Product aProduct = director.buildAProduct();
        System.out.println(aProduct.toString());

        Product bProduct = director.buildBProduct();
        System.out.println(bProduct.toString());

    }

}
