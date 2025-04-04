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
@Table(name = "brand")
public class Brand extends  BaseEntity{
    private String name;

    private String description;

    private String imageURL;

    @ManyToMany()
    @JoinTable(
            name = "brand_inventory",
            joinColumns = @JoinColumn(name = "brand_id"),
            inverseJoinColumns = @JoinColumn(name = "inventory_id")
    )
    private Set<Inventory> inventories;
}
