package com.greenz.greenzbackend.DTO;

import com.greenz.greenzbackend.Entity.Enum.Apartment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponseDTO {
    private UUID id;
    private String house;
    private String block;
    private Apartment Apartment;
    private String street;
    private String city;
    private String state;
    private String zip;
}
