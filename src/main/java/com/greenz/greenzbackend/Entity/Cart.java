package com.greenz.greenzbackend.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "cart")
public class Cart extends  BaseEntity{

    @OneToMany(mappedBy = "cart")
    private Set<CartItems> cartItems;

    @OneToOne
    private Customer customer;

    private Float totalPrice;

    private Float totalQuantity;

    private Float offer;

}
