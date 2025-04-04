package com.greenz.greenzbackend.Mapper;

import com.greenz.greenzbackend.DTO.CustomerRequestDTO;
import com.greenz.greenzbackend.DTO.CustomerResponseDTO;
import com.greenz.greenzbackend.Entity.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer toEntity(CustomerRequestDTO customerRequestDTO);
    CustomerResponseDTO toDto(Customer customer);
}
