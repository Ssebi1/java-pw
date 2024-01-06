package com.sebi.deliver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(force = true)
@AllArgsConstructor
@ToString
@Data
@Entity @Table(name = "users")
public class User {
    @Id
    @SequenceGenerator(name = "users_sequence", sequenceName = "users_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_sequence")
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    @NonNull
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private String city;

    private String phone;

    private String address;

    private String notes;

    @Transient
    private String token;

    public User(
            @NonNull String name,
            @NonNull String email,
            @NonNull String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
