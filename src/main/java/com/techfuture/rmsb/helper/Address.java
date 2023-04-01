package com.techfuture.rmsb.helper;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "taddress")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long addressId;
    private String street;
    private String city;
    private String District;
    private String pin;
    private String state;
    private String country;
}
