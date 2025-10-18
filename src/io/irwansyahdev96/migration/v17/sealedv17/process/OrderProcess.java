package io.irwansyahdev96.migration.v17.sealedv17.process;

import io.irwansyahdev96.migration.v17.sealedv17.dto.Order;
import io.irwansyahdev96.migration.v17.sealedv17.model.Cancelled;
import io.irwansyahdev96.migration.v17.sealedv17.model.Delivered;
import io.irwansyahdev96.migration.v17.sealedv17.model.Pending;
import io.irwansyahdev96.migration.v17.sealedv17.model.Shipped;

public class OrderProcess {

    public String process(Order order) {
        var status = order.status();
        
        if (status instanceof Pending p) {
            return p.transaction(order.id());
        } else if (status instanceof Shipped s) {
            return s.transaction(order.id());
        } else if (status instanceof Delivered d) {
            return d.transaction(order.id());
        } else if (status instanceof Cancelled c) {
            return c.transaction(order.id());
        } else {
            throw new IllegalStateException("Status tidak dikenal: " + status.getClass());
        }
    }
}
