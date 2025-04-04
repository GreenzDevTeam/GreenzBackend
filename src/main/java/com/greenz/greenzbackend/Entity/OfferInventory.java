package com.greenz.greenzbackend.Entity;

import com.greenz.greenzbackend.Entity.Enum.Unit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "offer")
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class OfferInventory extends BaseEntity{

    private String name;
    private String description;
    private String imageUrl;

    @ManyToMany
    @JoinTable(
            name = "offer_inventory_relationship",
            joinColumns = @JoinColumn(name = "offerInventory_id"),
            inverseJoinColumns = @JoinColumn(name = "inventory_id")

    )
    Set<Inventory> inventories = new HashSet<>();

}
