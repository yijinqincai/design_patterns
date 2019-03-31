package com.lwx.builder;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-03-31
 * Time: 20:42
 */
public interface Builder {

    void setPart(String name, String type);

    Product createProduce();

}
