package com.architecture.twitter.searchservice.controller;

import com.architecture.twitter.searchservice.entity.*;
import com.architecture.twitter.searchservice.service.SearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Search")
public class SearchController {
    private final SearchService searchService;


    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/tweets")
    public ResponseEntity<List<TweetEntity>> searchTweets(@PathVariable("searcherID") int searcherID,
                                                          @PathVariable("query") String query)
    {
        List<TweetEntity> result = searchService.searchTweets(searcherID, query);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserEntity>> searchUsers(@PathVariable("searcherID") int searcherID,
                                                          @PathVariable("query") String query)
    {
        List<UserEntity> result = searchService.searchUsers(searcherID, query);
        return ResponseEntity.ok().body(result);
    }

    @PostMapping("forwardTweet")
    public ResponseEntity<Boolean> receiveTweet(@PathVariable("tweet") TweetEntity tweet)
    {
        Boolean result = searchService.reverseIndexAndStoreTweet(tweet);
        return ResponseEntity.ok().body(result);
    }
}
