package com.greenz.greenzbackend.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TagsRequestDTO {
    private String name;
    private String description;
    private String imageUrl;
}
