package com.greenz.greenzbackend.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OfferInventoryResponseDTO {
    private UUID id;
    private String name;
    private String description;
    private String imageUrl;
    Set<InventoryResponseDTO> inventories = new HashSet<>();
}
