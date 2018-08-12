package com.tc.run;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock r=new ReentrantLock();
        r.lock();
        ac();
        //com.alibaba.dubbo.container.Main.main(args);
    }
    public static void ac(){
        ReentrantLock r=new ReentrantLock();
        ReentrantLock r1=new ReentrantLock(false);
        r.lock();
        System.out.println("得到锁");
        r.lock();
        System.out.println("继续执行");
        r.unlock();
        r1.unlock();
    }
    public static void ab(){

        synchronized (""){

            System.out.println("得到锁");
            synchronized (""){
                System.out.println("继续执行");
            }
        }

    }
}
