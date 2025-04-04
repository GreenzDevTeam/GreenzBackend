package com.greenz.greenzbackend.Mapper;

import com.greenz.greenzbackend.DTO.TagsRequestDTO;
import com.greenz.greenzbackend.Entity.Tags;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TagsMapper {
    Tags toEntity(TagsRequestDTO tagsRequestDTO);
    TagsRequestDTO toDto(Tags tags);
}
