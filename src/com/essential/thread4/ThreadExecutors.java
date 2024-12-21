package com.pdp.essential.thread4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processors implements Runnable{
    int id;
    public Processors(int id){
        this.id=id;
    }

    @Override
    public void run() {
        System.out.println("starting "+id);
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("completed "+id);
    }
}

public class ThreadExecutors {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            service.submit(new Processors(i));
        }
        service.shutdown();
        System.out.println("all tasks are completed");
        try {
            service.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("All tasks Completed");
    }
}
