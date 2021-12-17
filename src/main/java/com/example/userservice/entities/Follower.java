package com.example.userservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Follower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User theFollowedUser;
    private Long followerId;

    public Follower(User theFollowedUser, Long followerId) {
        this.theFollowedUser = theFollowedUser;
        this.followerId = followerId;
    }
}
