package com.greenz.greenzbackend.Mapper;

import com.greenz.greenzbackend.DTO.BrandRequestDTO;
import com.greenz.greenzbackend.DTO.BrandResponseDTO;
import com.greenz.greenzbackend.Entity.Brand;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BrandMapper {
    Brand toEntity(BrandRequestDTO brandRequestDTO);
    BrandResponseDTO toDto(Brand brand);
}
