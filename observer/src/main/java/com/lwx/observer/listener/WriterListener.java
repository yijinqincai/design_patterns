package com.lwx.observer.listener;

import java.util.EventListener;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-03
 * Time: 23:01
 */
public interface WriterListener extends EventListener {

    void addNovel(WriterEvent writerEvent);

}
