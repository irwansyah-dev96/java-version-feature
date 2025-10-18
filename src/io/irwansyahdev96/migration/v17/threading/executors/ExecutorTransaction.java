package io.irwansyahdev96.migration.v17.threading.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorTransaction {

    public void concurrency(){
        Transaction transaction = new Transaction();

        int numberOfTrx = 50;
        int numberOfThreads = 100;
        int amount = 100;

        long result = numberOfTrx * numberOfThreads;

        ExecutorService threadpool = Executors.newFixedThreadPool(numberOfThreads);

        for(int i = 0;i < numberOfTrx;i++){
            threadpool.submit(()->{
                transaction.credit(amount);
            });

            System.out.println("Current amount"+i+": "+ transaction.amount);
        }

        threadpool.shutdown();
        // try {
        //     threadpool.awaitTermination(10, TimeUnit.SECONDS);
        // } catch (InterruptedException e) {
            
        //     e.printStackTrace();
        // }

        System.out.println("Total amount: " + transaction.amount);
        System.out.println("Expected amount: " + result);
    }
    
}
