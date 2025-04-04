package com.greenz.greenzbackend.DTO;

import com.greenz.greenzbackend.Entity.Enum.Apartment;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressRequestDTO {
    private String house;
    private String block;
    private Apartment Apartment;
    private String street;
    private String city;
    private String state;
    private String zip;
}
