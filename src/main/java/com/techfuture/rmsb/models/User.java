package com.techfuture.rmsb.models;

import com.techfuture.rmsb.helper.Address;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="tUser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
    private long userId;
    @Column(name = "userFirstName")
    private String userFirstName;
    @Column(name = "userLastName")
    private String userLastName;
    @Column(name = "userGender")
    private String userGender;
    @Column(name = "userDOB")
    private String userDOB;
    @Column(name = "userMobile")
    private String userMobile;
    @Column(name = "userEmail")
    private String userEmail;
    @JoinColumn(name = "AddressId", referencedColumnName = "addressId")
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

}
