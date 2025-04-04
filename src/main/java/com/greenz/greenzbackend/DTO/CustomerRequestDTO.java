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
public class CustomerRequestDTO {
    private String userName;
    private Integer mobileNumber;
    private String email;
    private LocalDate birthDate;
    private String gender;
}
