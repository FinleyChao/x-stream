package com.foolish.xstream.test;

/**
 * @description:
 * @author：chaoxianfei
 * @date：2020/4/26 16:56
 */
public class Run {

    public static void main(String args[]){
        Thread thread = new MyThread();
        thread.start();
        thread.interrupt();
    }
}