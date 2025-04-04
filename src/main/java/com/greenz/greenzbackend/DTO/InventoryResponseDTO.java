package com.greenz.greenzbackend.DTO;

import com.greenz.greenzbackend.Entity.Brand;
import com.greenz.greenzbackend.Entity.Enum.Unit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryResponseDTO {
    private UUID id;
    private String name;
    private String description;
    private String imageUrl;
    private Float price;
    private Unit unit;
    private Brand brand;
    private Float stock;
}
