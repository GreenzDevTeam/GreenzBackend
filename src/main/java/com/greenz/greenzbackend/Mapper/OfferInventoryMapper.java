package com.greenz.greenzbackend.Mapper;

import com.greenz.greenzbackend.DTO.OfferInventoryRequestDTO;
import com.greenz.greenzbackend.DTO.OfferInventoryResponseDTO;
import com.greenz.greenzbackend.Entity.OfferInventory;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OfferInventoryMapper {
    OfferInventory toEntity(OfferInventoryRequestDTO offerInventoryRequestDTO);
    OfferInventoryResponseDTO toDto(OfferInventory offerInventory);
}
