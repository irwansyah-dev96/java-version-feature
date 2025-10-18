package io.irwansyahdev96.migration.v17.sealedv17.model;

public final class Pending extends OrderStatus{
    
    @Override
    public String transaction(int id) {
        return "Order " + id + " masih menunggu konfirmasi.";
    }
}
