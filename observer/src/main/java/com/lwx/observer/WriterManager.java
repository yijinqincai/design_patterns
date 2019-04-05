package com.lwx.observer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description: 管理者，保持一份独有的作者列表
 * User: lwx
 * Date: 2019-04-01
 * Time: 23:27
 */
public class WriterManager {

    private Map<String, Writer> writeMap = new HashMap<String, Writer>();

    //添加作者
    public void add(Writer writer) {
        writeMap.put(writer.getName(), writer);
    }

    //根据作者姓名获取作者
    public Writer getWriter(String name) {
        return writeMap.get(name);
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
