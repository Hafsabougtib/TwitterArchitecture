package com.architecture.twitter.searchservice.service;

import com.architecture.twitter.searchservice.entity.TweetEntity;
import org.springframework.stereotype.Service;

@Service
public interface CacheService {
    default TweetEntity getTweetFromCache(int tweetID)
    {
        // look for tweet in the cache local storage
        // in case of cache miss get the tweet from the global DB
        // replace the oldest tweet in the cache with the fetched tweet
        return null;
    }
}
