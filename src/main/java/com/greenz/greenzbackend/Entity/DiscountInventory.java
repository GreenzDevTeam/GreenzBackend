package com.greenz.greenzbackend.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "discount")
public class DiscountInventory extends BaseEntity {
    private String name;

    private String description;

    private String imageURL;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    @ManyToMany()
    @JoinTable(
            name = "discount_inventory_relationship",
            joinColumns = @JoinColumn(name = "discountInventory_id"),
            inverseJoinColumns = @JoinColumn(name = "inventory_id")
    )
    private Set<Inventory> inventories;
}
