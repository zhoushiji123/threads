package com.zsj.myThread;

import com.zsj.threadFactory.MyThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by zsj on 2017/7/30.
 */
public class Main {

    public static void main(String[] args) {
        MyThreadFactory factory = new MyThreadFactory("myThread");
        int poolsize = 3;
        ScheduledExecutorService schedulePool = Executors.newScheduledThreadPool(3,factory);

        //初始化0ms后执行，200ms后重新执行
        //schedulePool.scheduleAtFixedRate(factory.newThread(new MyThread()),0,200, TimeUnit.MILLISECONDS);

        //初始化1s后执行，执行完后2s再次执行
        schedulePool.scheduleWithFixedDelay(factory.newThread(new MyThread()),0,2,TimeUnit.SECONDS);



    }
}
