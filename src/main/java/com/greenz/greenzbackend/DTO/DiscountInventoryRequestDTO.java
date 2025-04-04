package com.greenz.greenzbackend.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DiscountInventoryRequestDTO {
    private String name;
    private String description;
    private String imageUrl;
    private LocalDate startDate;
    private LocalDate endDate;
}
