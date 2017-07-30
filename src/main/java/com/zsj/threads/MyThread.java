package com.zsj.threads;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Created by zsj on 2017/4/3.
 */
public class MyThread implements Runnable {


    public MyThread(){

    }

    @Override
    public void run() {

            try {
                Thread.sleep(2000);
                System.out.println("线程111");
            }catch (Exception e){
                e.printStackTrace();
            }


    }


}
