package com.example.userservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    private Date createdAt;
    private Boolean isEnabled = false;
    private Boolean isLocked = true;

    @NonNull
    private String password;

    @Column(unique = true)
    @NonNull
    private String email;

    @OneToMany
    @JoinColumn(name = "followers_user_id")
    private List<Follower> followers;

    @OneToMany
    @JoinColumn(name = "followees_user_id")
    private List<Followee> followees;

    public User(@NonNull String firstName, @NonNull String lastName, @NonNull String password, @NonNull String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }
}
