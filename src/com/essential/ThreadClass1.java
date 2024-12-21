package com.pdp.essential;

import java.util.concurrent.*;

public class ThreadClass1 implements Runnable{
    public static void main(String[] args) {

        int cpuCoreCount = Runtime.getRuntime().availableProcessors();
        System.out.println(cpuCoreCount);
        //FixedThreadPool
       // ExecutorService service = Executors.newFixedThreadPool(cpuCoreCount);
        /*for (int i = 0; i < 100; i++) {
            service.execute(new ThreadClass1());
        }*/
        ScheduledExecutorService scheduledservice = Executors.newScheduledThreadPool(10);
        scheduledservice.schedule(new ThreadClass1(),10, TimeUnit.SECONDS);
        scheduledservice.scheduleAtFixedRate(new ThreadClass1(),15,10,TimeUnit.SECONDS);
        scheduledservice.scheduleWithFixedDelay(new ThreadClass1(),15,10,TimeUnit.SECONDS);
        //scheduleExecitor

        System.out.println("main Thread");
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
    }
}
