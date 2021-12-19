package com.architecture.twitter.searchservice.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = "likeId")
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
    private String tweetContent;

    @OneToMany
    private List<CommentEntity> comments;

    @OneToMany
    private List<LikeEntity> tweetLikes;

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

    public String getTweetContent() {
        return tweetContent;
    }

    public void setTweetContent(String tweetMessage) {
        this.tweetContent = tweetMessage;
    }

    public int getRetweetNumber() {
        return retweetNumber;
    }

    public void setRetweetNumber(int retweetNumber) {
        this.retweetNumber = retweetNumber;
    }

    public List<CommentEntity> getComments() {
        return comments;
    }

    public void setComments(List<CommentEntity> comments) {
        this.comments = comments;
    }

    public List<LikeEntity> getTweetLikes() {
        return tweetLikes;
    }

    public void setTweetLikes(List<LikeEntity> tweetLikes) {
        this.tweetLikes = tweetLikes;
    }
}
