package com.zsj.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zsj on 2017/7/23.
 * 线程池
 */
public class PoolTest {

    public static void main(String[] args) {

        //只以单个工作线程执行的线程池，保证任务按顺序执行
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        ExecutorService singleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();

        //可缓存线程池，可灵活回收空闲的线程
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        //定长线程池，控制线程并发数，超出数量的线程会在队列中等待
        ExecutorService  fixedThreadPool = Executors.newFixedThreadPool(10);

        //周期定长线程池，可定时和周期性的执行线程任务
        ExecutorService scheduledThreadPool= Executors.newScheduledThreadPool(10);



    }
}
