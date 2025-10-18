package io.irwansyahdev96.migration.v17.threading;

import io.irwansyahdev96.migration.v17.threading.executors.ExecutorTransaction;

public class Threading {
    
    public static void show(){
        System.out.println("Threading in Java 17");
        ExecutorTransaction executorTransaction = new ExecutorTransaction();
        executorTransaction.concurrency();
    }
}
