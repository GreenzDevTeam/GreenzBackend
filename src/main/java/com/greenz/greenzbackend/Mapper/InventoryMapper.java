package com.greenz.greenzbackend.Mapper;

import com.greenz.greenzbackend.DTO.InventoryRequestDTO;
import com.greenz.greenzbackend.DTO.InventoryResponseDTO;
import com.greenz.greenzbackend.Entity.Inventory;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InventoryMapper {
    Inventory toEntity(InventoryRequestDTO inventoryRequestDTO);
    InventoryResponseDTO toDto(Inventory inventory);
}
