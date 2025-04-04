package com.greenz.greenzbackend.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
@Table(name = "category")
public class Category extends BaseEntity{
    private String name;

    private String description;

    private String imageURL;

    @OneToMany(mappedBy = "category")
    private Set<Inventory> inventories;
}
