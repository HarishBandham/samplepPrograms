package com.pdp.essential.demoThreads;



public class App {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
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
        });

        t1.start();

        for (int i = 5; i > 0; i--) {
            System.out.println("main thread "+i);
        }
    }
}
