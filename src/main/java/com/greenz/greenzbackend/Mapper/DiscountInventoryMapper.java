package com.greenz.greenzbackend.Mapper;

import com.greenz.greenzbackend.DTO.DiscountInventoryRequestDTO;
import com.greenz.greenzbackend.DTO.DiscountInventoryResponseDTO;
import com.greenz.greenzbackend.Entity.DiscountInventory;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DiscountInventoryMapper {
    DiscountInventory toEntity(DiscountInventoryRequestDTO discountInventoryRequestDTO);
    DiscountInventoryResponseDTO toDto(DiscountInventory discountInventory);
}
