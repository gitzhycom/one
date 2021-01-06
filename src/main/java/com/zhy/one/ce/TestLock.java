package com.zhy.one.ce;

import java.io.InputStream;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: zhanghongyu
 * @time: 2020/12/22 10:34
 */
public class TestLock {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

}
class MyList {
    String[] arr = new String[]{};
    int index;
    public void add(String str){
        arr[index] = str;
        index++;
    }
}
