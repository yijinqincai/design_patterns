package com.lwx.observer.listener;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-03
 * Time: 23:05
 */
public class WriterManager {

    private Map<String, Writer> writerMap = new HashMap<String, Writer>();

    //添加作者
    public void add(Writer writer) {
        writerMap.put(writer.getName(), writer);
    }

    //根据作者姓名获取作者
    public Writer getWriter(String name) {
        return writerMap.get(name);
    }

    //单例
    private WriterManager() {
    }

    public static WriterManager getInstance() {
        return WriterManagerInstance.instance;
    }

    private static class WriterManagerInstance {
        private static WriterManager instance = new WriterManager();
    }

}
