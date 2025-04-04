package com.greenz.greenzbackend.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@Table(name = "tags")
@NoArgsConstructor
@AllArgsConstructor
public class Tags extends BaseEntity {
    private String name;
    private String description;
    private String imageUrl;

    @ManyToMany
    @JoinTable(
            name = "tags_inventory_relationship",
            joinColumns = @JoinColumn(name = "tags_id"),
            inverseJoinColumns = @JoinColumn(name = "inventory_id")
    )
    private Set<Inventory> inventories;
}
