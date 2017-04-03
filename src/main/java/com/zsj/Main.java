package com.zsj;

import com.zsj.threads.Customer;
import com.zsj.threads.MyThread;
import com.zsj.threads.Producer;

/**
 * Created by zsj on 2017/4/3.
 */
public class Main {

    public static void main(String[] args) {

        Thread producer = new Thread(new Producer());
        Thread c1 = new Thread(new Customer("c1"));
        Thread c2 = new Thread(new Customer("c2"));

        producer.start();
        c1.start();
        c2.start();
    }

}
