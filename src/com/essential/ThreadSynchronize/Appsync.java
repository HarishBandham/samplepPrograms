package com.pdp.essential.ThreadSynchronize;

public class Appsync {
    private int count=0;
    public static void main(String[] args) {
        Appsync obj = new Appsync();
        obj.dowork();
    }
    public synchronized void increment(){
        count++;
    }
    private void dowork() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
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

        System.out.println("count :"+count);
    }
}
