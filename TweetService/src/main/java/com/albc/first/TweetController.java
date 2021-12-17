package com.albc.first;


import com.albc.first.entities.TweetEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/Tweet")
public class TweetController {


    @Autowired
    private TweetService tweetService;


    @GetMapping("likeTweet")
    public ResponseEntity<Boolean> likeTweet(@PathVariable(value = "tweetId") int tweetId,
                                             @PathVariable(value = "userId") int userId){

        boolean isTweetLiked= tweetService.likeTweet(tweetId,userId);
        return ResponseEntity.ok().body(isTweetLiked);
    }

    @GetMapping("commentsTweet")
    public ResponseEntity<Boolean> commentsTweet(@PathVariable(value = "tweetId") int tweetId,
                                             @PathVariable(value = "userId") int userId,
                                             @PathVariable(value = "comment")String comment    ){

        boolean isCommentAdded = tweetService.commentTweet(tweetId,userId,comment);
        return  ResponseEntity.ok().body(isCommentAdded);
    }

    @PostMapping("addTweet")
    public ResponseEntity<Boolean> addNewTweet(@RequestBody com.albc.first.Dtos.RequestBody requestBody ){

        TweetEntity newTweet=new TweetEntity();
        newTweet.setUserId(requestBody.getUserId());
        newTweet.setTweetMessage(requestBody.getMessage());
        boolean isTweetAdded= tweetService.addNewTweet(newTweet);
        if(isTweetAdded){
            tweetService.forwardTweetToTimeLine(newTweet);
            tweetService.forwardTweetToSearchService(newTweet);
        }
        return ResponseEntity.ok().body(isTweetAdded);

    }






}
