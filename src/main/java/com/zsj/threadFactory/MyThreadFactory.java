package com.zsj.threadFactory;

import java.util.concurrent.ThreadFactory;

/**
 * Created by zsj on 2017/7/23.
 * 线程创建的执行者
 */
public class MyThreadFactory implements ThreadFactory {


    private String name ;
    private int number  = 0 ;

    public MyThreadFactory(String name){
        this.name = name;
    }


    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r,name);
    }
}
