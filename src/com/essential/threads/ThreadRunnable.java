package com.pdp.essential.threads;


class Runner1 implements Runnable{
    public void run() {
            for (int i = 0; i < 10; i++) {

                System.out.println("runnable "+ i);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

public class ThreadRunnable {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner1());
        Thread t2 = new Thread(new Runner1());

        t1.start();
        t2.start();

        for (int i = 5; i > 0; i--) {
            System.out.println("main thread "+i);
        }
    }

}
