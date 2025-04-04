package com.greenz.greenzbackend.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "customer")
public class Customer extends BaseEntity {

    private String userName;

    private  Integer mobileNumber;

    private String email;

    private LocalDate birthDate;

    private String gender;

    @OneToOne
    private Cart cart;

}
