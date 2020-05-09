package com.foolish.xstream.test;

/**
 * @description:
 * @author：chaoxianfei
 * @date：2020/4/26 16:55
 */
public class MyThread extends Thread {

    @Override
    public void run(){
        try {
            System.out.println("线程开始。。。");
            for(int i=0; i<10000; i++){
                System.out.println("i=" + i);
            }
            Thread.sleep(200000);
            System.out.println("线程结束。");
        } catch (InterruptedException e) {
            System.out.println("先停止，再遇到sleep，进入catch异常");
            e.printStackTrace();
        }

    }
}

