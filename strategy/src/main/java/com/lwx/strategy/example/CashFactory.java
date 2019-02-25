package com.lwx.strategy.example;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-02-24
 * Time: 21:07
 */
public class CashFactory {

    private CashFactory() {
        this.init();
    }

    //这里是一个常量，表示我们要扫描的包
    private static final String CASH_PACKAGE = "com.lwx.strategy.example";

    //初始化类加载器，任何类运行时信息必需来自该类加载器
    private ClassLoader classLoader = getClass().getClassLoader();

    private List<Class<? extends CashSuper>> cashList; //策略列表

    //根据顾客的类型产生相应的策略
    public CashSuper createCashPush(Customer customer, double... parameters) {
        //在策略列表中查找策略
        for (Class<? extends CashSuper> clazz : cashList) {
            CustomerType annotation = clazz.getAnnotation(CustomerType.class);
            if (annotation.type() == customer.getType()) {
                try {
                    CashSuper cashSuper = null;
                    if (customer.getType() != 1) {
                        Constructor<? extends CashSuper> constructor1 = clazz.getDeclaredConstructor(double[].class);
                        cashSuper = constructor1.newInstance(parameters);
                    } else {
                        cashSuper = clazz.newInstance();
                    }
                    return cashSuper;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RuntimeException("策略获取失败");
                }
            }
        }
        throw new RuntimeException("策略获取失败");
    }

    //在工程初始化时要初始化策略列表
    private void init() {
        cashList = new ArrayList<Class<? extends CashSuper>>();
        //获取包下所有的class文件
        File[] resources = getClassResource();
        Class<CashSuper> cashSuperClass = null;
        try {
            //使用相同的加载器加载策略父接口
            cashSuperClass = (Class<CashSuper>) classLoader.loadClass(CashSuper.class.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("未找到策略资源");
        }
        for (int i = 0; i < resources.length; i++) {
            try {
                //载入包下的类
                Class<?> clazz = classLoader.loadClass(CASH_PACKAGE + "." + resources[i].getName().replace(".class", ""));
                //判断是否是CashSuper的实现类并且不是CashSuper本身
                if (CashSuper.class.isAssignableFrom(clazz) && clazz != cashSuperClass) {
                    cashList.add((Class<? extends CashSuper>) clazz);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                throw new RuntimeException("未找到策略资源");
            }
        }
    }

    //获取扫描的包下面所有的class文件
    private File[] getClassResource() {
        try {
            File file = new File(classLoader.getResource(CASH_PACKAGE.replace(".", "/")).toURI());
            return file.listFiles(new FileFilter() {
                public boolean accept(File pathname) {
                    //只扫描class文件
                    if (pathname.getName().endsWith(".class")) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("未找到策略资源");
        }
    }

    public static CashFactory getInstance() {
        return CashFactoryInstance.instance;
    }


    private static class CashFactoryInstance {
        private static CashFactory instance = new CashFactory();
    }

}
