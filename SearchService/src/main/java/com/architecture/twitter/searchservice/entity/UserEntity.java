package com.architecture.twitter.searchservice.entity;

import javax.persistence.*;

@Entity
public class UserEntity {

    public int getUserID() {
        return userID;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;


}
