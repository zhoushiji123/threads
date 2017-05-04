package com.zsj.local;

import java.util.HashMap;

/**
 * Created by zsj on 2017/5/4.
 */
public class TestThread implements Runnable {

    private  int id;

    public TestThread (int id){
        this.id = id;
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" start");
        HashMap map = TestThreadLocal.threadLocal.get();
        for(int i=0;i<10;i++){
            map.put(i,i+id*100);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+":"+map);
    }
}
