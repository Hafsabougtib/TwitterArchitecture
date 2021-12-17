package com.albc.first.entities;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = "likeId")
})
public class likeEntity {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int likeId;

    private int userid;

    @ManyToOne
    private TweetEntity tweet;

    public int getLikeId() {
        return likeId;
    }

    public void setLikeId(int likeId) {
        this.likeId = likeId;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public TweetEntity getTweet() {
        return tweet;
    }

    public void setTweet(TweetEntity tweet) {
        this.tweet = tweet;
    }
}
