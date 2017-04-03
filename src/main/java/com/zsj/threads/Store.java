package com.zsj.threads;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by zsj on 2017/4/3.
 */
@Component
public class Store {


    private static Store instance =  new Store();

    private  static  Queue<String> queue = new LinkedList<>();

    public Store(){
    }

    public static Store getInstance(){
        return instance;
    }

    public  void add(String str){
        synchronized (queue){
            System.out.println("生产者进入仓库--生产了:"+str);
            queue.offer(str);
            queue.notify(); //有商品了 唤醒一个消费者
        }

    }

    public  String get(){

        synchronized (queue){

            System.out.println(Thread.currentThread().getName()+"线程进入仓库");

            try {
                if(queue.size() ==0 )  //没有商品 该消费者阻塞
                    queue.wait();

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        return queue.poll();//苏醒后 获得商品
    }

    public  int getCounts(){
        return queue.size();
    }

}
