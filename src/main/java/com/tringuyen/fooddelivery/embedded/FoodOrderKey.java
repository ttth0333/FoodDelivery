package com.tringuyen.fooddelivery.embedded;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
public class FoodOrderKey implements Serializable {
    @Column(name = "id_order", nullable = false)
    private int idOrder;

    @Column(name = "id_food", nullable = false)
    private int idFood;

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdFood() {
        return idFood;
    }

    public void setIdFood(int idFood) {
        this.idFood = idFood;
    }
}
