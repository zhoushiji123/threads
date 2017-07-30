package com.zsj.myThread;

import zucc.zhoushiji.utils.DateUtil;

/**
 * Created by zsj on 2017/7/30.
 */
public class MyThread implements Runnable{



    @Override
    public void run() {
            try {
                System.out.println("当前时间: "+ DateUtil.getCurrentTime());
                System.out.println("1111");
                //Thread.currentThread().sleep(500);
                System.out.println("2222");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
