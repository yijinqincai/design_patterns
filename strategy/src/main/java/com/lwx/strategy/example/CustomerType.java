package com.lwx.strategy.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 * Description: 顾客类型注解
 * User: lwx
 * Date: 2019-02-24
 * Time: 20:51
 */
@Target(ElementType.TYPE)  //表示只能给类添加该注解
@Retention(RetentionPolicy.RUNTIME) //这个必需将注解保留在运行时
public @interface CustomerType {

    int type() default 1;

}
