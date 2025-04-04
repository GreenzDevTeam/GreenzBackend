package com.greenz.greenzbackend.Entity;

import com.greenz.greenzbackend.Entity.Enum.Unit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "inventory")
public class Inventory extends BaseEntity {

    private String name;

    private String description;

    private String imageURL;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    private Float price;

    private Float quantity;

    @Enumerated(EnumType.STRING) // Ensure Unit is stored properly
    private Unit unit;

    @OneToMany(mappedBy = "inventory", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CartItems> cartItems = new HashSet<>();

    @ManyToMany(mappedBy = "inventories") // Ensure correct field name in Discount entity
    private Set<DiscountInventory> discountInventory = new HashSet<>();

    @ManyToMany(mappedBy = "inventories")
    private Set<OfferInventory> offerInventory = new HashSet<>();

    @ManyToMany(mappedBy = "inventories")
    private Set<Tags> tags = new HashSet<>();


    @ManyToOne
    @JoinColumn(name = "brand_id", nullable = false)
    private Brand brand;

    private Float stock;

}
