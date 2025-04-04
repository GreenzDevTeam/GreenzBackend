package com.greenz.greenzbackend.DTO;

import com.greenz.greenzbackend.Entity.Inventory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DiscountInventoryResponseDTO {
    private UUID id;
    private String name;
    private String description;
    private String imageUrl;
    private LocalDate startDate;
    private LocalDate endDate;
    private Set<InventoryResponseDTO> inventories;
}
