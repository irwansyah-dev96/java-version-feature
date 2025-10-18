package io.irwansyahdev96.migration.v17.sealedv17.model;

public sealed abstract class OrderStatus permits Pending, Shipped, Delivered, Cancelled {
    
    public abstract String transaction(int id);
}
