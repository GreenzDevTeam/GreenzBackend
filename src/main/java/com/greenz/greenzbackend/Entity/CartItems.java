package com.greenz.greenzbackend.Entity;

import com.greenz.greenzbackend.Entity.Enum.Unit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "cart_items")
public class CartItems extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "inventory_id", nullable = false)
    private Inventory inventory;

    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;

    private Float price;

    private Float quantity;

    @Enumerated(EnumType.STRING)
    private Unit unit;

    private Float discount;
}
