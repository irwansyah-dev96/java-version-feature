package io.irwansyahdev96.migration.v17.sealedv17.model;

public final class Cancelled extends OrderStatus{

    @Override
    public String transaction(int id) {
        
        return "Order " + id + " telah dibatalkan.";
    }
    
}
