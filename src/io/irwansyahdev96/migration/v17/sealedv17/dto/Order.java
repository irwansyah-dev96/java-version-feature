package io.irwansyahdev96.migration.v17.sealedv17.dto;

import io.irwansyahdev96.migration.v17.sealedv17.model.OrderStatus;

public record Order(int id, String customer, OrderStatus status) {
    
}
