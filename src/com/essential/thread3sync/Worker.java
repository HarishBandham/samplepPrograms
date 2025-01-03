package com.pdp.essential.thread3sync;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {

    private Object lock1 =new Object();
    private Object lock2 =new Object();
    Random ramdom = new Random();
    static List<Integer> list1 = new ArrayList<>();
    static List<Integer> list2 = new ArrayList<>();
    public void stageOne(){
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list1.add(ramdom.nextInt(100));
        }
    }

    public synchronized void stageTwo(){
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list2.add(ramdom.nextInt(100));
        }
    }

    public void process(){
        for (int i = 0; i < 1000; i++) {
            stageOne();
            stageTwo();
        }
    }
    public void main() {
        System.out.println("startig.....");
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
               process();
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
           t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long End = System.currentTimeMillis();
        System.out.println("time : "+(End-start));
        System.out.println("List1 "+list1.size() +"  List2 "+list2.size());
    }
}
