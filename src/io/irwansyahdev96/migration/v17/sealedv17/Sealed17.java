package io.irwansyahdev96.migration.v17.sealedv17;

import java.util.List;

import io.irwansyahdev96.migration.v17.sealedv17.dto.Order;
import io.irwansyahdev96.migration.v17.sealedv17.model.Cancelled;
import io.irwansyahdev96.migration.v17.sealedv17.model.Delivered;
import io.irwansyahdev96.migration.v17.sealedv17.model.Pending;
import io.irwansyahdev96.migration.v17.sealedv17.model.Shipped;
import io.irwansyahdev96.migration.v17.sealedv17.process.OrderProcess;

public class Sealed17 {
    
    public static void show() {
         List<Order> orders = List.of(
                new Order(1, "Irwan", new Pending()),
                new Order(2, "Sinta", new Shipped()),
                new Order(3, "Andi", new Delivered()),
                new Order(4, "Rizal", new Cancelled())
        );

        OrderProcess op = new OrderProcess();

        orders.forEach(order -> {
            String message = op.process(order);
            System.out.println(message);
        });
    }
}
