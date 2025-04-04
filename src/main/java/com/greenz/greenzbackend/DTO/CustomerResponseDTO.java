package com.greenz.greenzbackend.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerResponseDTO {
    private UUID id;
    private String userName;
    private Integer mobileNumber;
    private String email;
    private LocalDate birthDate;
    private String gender;
}
