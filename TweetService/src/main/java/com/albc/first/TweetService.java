package com.albc.first;

import com.albc.first.entities.TweetEntity;
import org.springframework.stereotype.Service;


@Service
public interface TweetService {

    default  boolean likeTweet(int tweetId,int userId){
        return true;
    }

    default boolean addNewTweet(TweetEntity tweet) {
        return true;
    }
    default boolean  commentTweet(int tweetId,int userId, String comment){
        return true;
    }

    default boolean forwardTweetToTimeLine(TweetEntity tweet ){
        return true;
    }
    default  boolean forwardTweetToSearchService(TweetEntity tweet){
        return true;
    }



}
