package com.zsj.local;

import java.util.HashMap;

/**
 * Created by zsj on 2017/5/4.
 * ThreadLocal 作用： 为每一个线程维护变量的副本。
 * 内部包含一个HashMap用于保存副本
 */
public class TestThreadLocal {

    public static ThreadLocal<HashMap> threadLocal = new ThreadLocal<HashMap>(){
        @Override
        protected HashMap initialValue() {
            System.out.println(Thread.currentThread().getName()+" initValue");
            return new HashMap();
        }
    };


    public static void main(String[] args) {
        Thread[] threads = new Thread[3];
        for(int i=0;i<threads.length;i++){
            threads[i] = new Thread(new TestThread(i));
            threads[i].start();
        }
    }

}
