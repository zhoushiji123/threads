package com.zsj.threads;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zsj on 2017/4/3.
 */
public class Customer implements Runnable {

    private String name;

    public Customer(String name){
        this.name = name;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(3000);
                String s = Store.getInstance().get();
                System.out.println("线程-"+name+" 获得了商品: "+s);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
