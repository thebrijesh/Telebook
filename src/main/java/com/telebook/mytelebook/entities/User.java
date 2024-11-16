package com.telebook.mytelebook.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity(name = "user")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    private String userId;
    @Column(name = "user_name", nullable = false)

    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    @Getter(AccessLevel.NONE)
    private String password;
    @Column(length = 1000)
    private String about;
    @Column(length = 1000)
    private String profilePic;
    private String phoneNumber;

    @Getter(value = AccessLevel.NONE)
    // information
    private boolean enabled = false;

    private boolean emailVerified = false;
    private boolean phoneVerified = false;

    //self, google, facebook, GitHub, twitter etc
    private Providers provider = Providers.SELF;
    private String providerId;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Contact> contacts;

}
