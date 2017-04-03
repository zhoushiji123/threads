package com.zsj.threads;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zsj on 2017/4/3.
 */


public class Producer implements Runnable {



    private  int i=0;

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(2000);
                String s = "商品"+i+"号";
                Store.getInstance().add(s);
                i++;
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }



}
