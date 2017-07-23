package com.zsj.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zsj on 2017/7/23.
 * 线程池
 */
public class PoolTest {

    public static void main(String[] args) {

        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        ExecutorService singleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        ExecutorService  fixedThreadPool = Executors.newFixedThreadPool(10);

        ExecutorService scheduledThreadPool= Executors.newScheduledThreadPool(10);



    }
}
