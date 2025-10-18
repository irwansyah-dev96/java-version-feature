package io.irwansyahdev96.migration.v17.sealedv17.model;

public final class Delivered extends OrderStatus{
    
    @Override
    public String transaction(int id) {
        
        return "Order " + id + " telah diterima pelanggan.";
    }
}
