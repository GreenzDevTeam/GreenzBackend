package com.greenz.greenzbackend.Mapper;

import com.greenz.greenzbackend.DTO.AddressRequestDTO;
import com.greenz.greenzbackend.DTO.AddressResponseDTO;
import com.greenz.greenzbackend.Entity.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    Address toEntity(AddressRequestDTO addressRequestDTO);
    AddressResponseDTO toDto(Address address);
}
