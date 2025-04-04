package com.greenz.greenzbackend.Mapper;

import com.greenz.greenzbackend.DTO.CategoryRequestDTO;
import com.greenz.greenzbackend.DTO.CategoryResponseDTO;
import com.greenz.greenzbackend.Entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    Category toEntity(CategoryRequestDTO categoryRequestDTO);
    CategoryResponseDTO toDto(Category category);
}

