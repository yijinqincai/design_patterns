package com.lwx.builder;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-03-31
 * Time: 20:47
 */
public class Director {

    private Builder builder = new ConcreteBuilder();

    public Product buildAProduct() {
        builder.setPart("法拉利", "911");
        return builder.createProduce();
    }

    public Product buildBProduct(){
        builder.setPart("宝马汽车", "730");
        return builder.createProduce();
    }

}
