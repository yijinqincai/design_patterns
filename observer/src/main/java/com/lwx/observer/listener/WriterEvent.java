package com.lwx.observer.listener;


import java.util.EventObject;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-03
 * Time: 23:00
 */
public class WriterEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public WriterEvent(Object source) {
        super(source);
    }

    public Writer getWriter() {
        return (Writer) super.getSource();
    }

}
