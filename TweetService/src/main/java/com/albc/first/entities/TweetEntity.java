package com.albc.first.entities;


import com.albc.first.entities.commentEntity;
import com.albc.first.entities.likeEntity;

import javax.persistence.*;
import java.util.List;

@Entity

@Table(name = "TweetEntity",uniqueConstraints = {
        @UniqueConstraint(columnNames = "TweetId")
})
public class TweetEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TweetId ;

    @Id
    private int userId;
    private  int retweetNumber;
    private  int likesNumber;
    private  int commentsNumber;

    @Column(length = 150)
    private String tweetMessage;

    @OneToMany
    private List<commentEntity> comments;

    @OneToMany
    private List<likeEntity> tweetLikes;

    public void setTweetId(int tweetId) {
        TweetId = tweetId;
    }

    public int getUserId() {
        return userId;
    }

    public int getTweetId() {
        return TweetId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTweetMessage() {
        return tweetMessage;
    }

    public void setTweetMessage(String tweetMessage) {
        this.tweetMessage = tweetMessage;
    }

    public int getRetweetNumber() {
        return retweetNumber;
    }

    public void setRetweetNumber(int retweetNumber) {
        this.retweetNumber = retweetNumber;
    }

    public List<commentEntity> getComments() {
        return comments;
    }

    public void setComments(List<commentEntity> comments) {
        this.comments = comments;
    }

    public List<likeEntity> getTweetLikes() {
        return tweetLikes;
    }

    public void setTweetLikes(List<likeEntity> tweetLikes) {
        this.tweetLikes = tweetLikes;
    }
}
