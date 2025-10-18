package io.irwansyahdev96.migration.v17.threading.executors;

public class Transaction {
    public Integer amount=0;

    public synchronized Integer credit(Integer amount) {
        this.amount += amount;
        return this.amount;
    }

    public synchronized Integer debit(Integer amount) {
        this.amount -= amount;
        return this.amount;
    }
    
}
