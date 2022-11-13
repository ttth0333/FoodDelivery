package com.tringuyen.fooddelivery.embedded;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderStatusKey implements Serializable {
    @Column(name = "id_order", nullable = false)
    private int idOrder;

    @Column(name = "id_status", nullable = false)
    private int idStatus;

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }
}
