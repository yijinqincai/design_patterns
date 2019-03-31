package com.lwx.builder;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-03-31
 * Time: 20:45
 */
public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    public void setPart(String name, String type) {
        product.setName(name);
        product.setType(type);
    }

    public Product createProduce() {
        return this.product;
    }

}
