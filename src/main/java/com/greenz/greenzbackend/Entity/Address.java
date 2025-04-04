package com.greenz.greenzbackend.Entity;


import com.greenz.greenzbackend.Entity.Enum.Apartment;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "address")
public class Address extends BaseEntity {

    private String house;
    private String block;
    @Enumerated(EnumType.STRING)
    private Apartment Apartment;
    private String street;
    private String city ;
    private String state;
    private String zip;

}
