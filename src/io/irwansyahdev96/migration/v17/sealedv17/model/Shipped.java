package io.irwansyahdev96.migration.v17.sealedv17.model;

public final class Shipped extends OrderStatus{
    
    @Override
    public String transaction(int id) {
        return "Order " + id + " sedang dalam pengiriman.";
    }
}
