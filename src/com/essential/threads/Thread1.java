package com.pdp.essential.threads;

class Runner extends Thread{

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println("hello "+ i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class Thread1 {

    public static void main(String[] args) {

            Runner r1 = new Runner();
            r1.start();

           Runner r2 = new Runner();
           r2.start();

        for (int i = 5; i > 0; i--) {
            System.out.println("main thread "+i);
        }
    }
}
