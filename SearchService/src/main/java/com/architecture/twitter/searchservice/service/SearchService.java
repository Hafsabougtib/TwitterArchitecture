package com.architecture.twitter.searchservice.service;

import com.architecture.twitter.searchservice.entity.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SearchService {

    default List<TweetEntity> searchTweets(int searcherID, String query)
    {
        return null;
    }
    default List<UserEntity> searchUsers(int searcherID, String query)
    {
        return null;
    }

    default Boolean reverseIndexAndStoreTweet(TweetEntity tweet)
    {
        return true;
    }

}
