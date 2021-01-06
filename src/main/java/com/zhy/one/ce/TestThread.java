package com.zhy.one.ce;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author: zhanghongyu
 * @time: 2020/12/22 9:56
 */
public class TestThread {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Thread t1 = new Thread(new MyTask1());
        Thread t2 = new Thread(new MyTask2());

        es.submit(t1);
        es.submit(t2);

        es.shutdown();
    }


    static class MyTask1 implements Runnable{
        @Override
        public void run() {
            System.out.println("MyTask1 ");
        }
    }
    static class MyTask2 extends Thread{
        @Override
        public void run() {
            System.out.println("MyTask2 ");
        }
    }
}
