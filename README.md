# TwitterArchitecture: 

1 Our services : 
  - User service : 
       user entity 
            userId 
            first name 
            last name 
            creaation date 
            isenabled 
            islocked 
            password 
            email 
            list of followers 
            list of followees 
        interface => crud methods           
        
  - Tweeeeeet : 
    - tweetEntity 
        tweetId 
        userId 
        retweetNumber 
        likesNumber
        commentsNumber
        tweetMessage 
    - interface methodes => ....
    - Controller 
  
   -Search Service:
        the search query will be posted to the "end point" and will be used to search (no entity needed)
        interface => ... functions
        controller 
   - Social Graph : TODO(fakhri): add what is needed
        
   -User time line : 
       here we display the last 20 tweets of the user ( we need user id for that ) 
       interface 
       controller 
       
   - home time line : 
      we display the 20 most reletable tweets to the user ( we only need the userId )
      interfaces 
      controller
   
   - social graph service  : 
        methods :
          list of followers
          generate social graphe (level 2)
          followUser(user1 want to follow user2)
   - direct message service 
      entity message 
        senderId 
        list of ids of recipients 
        message content 
        sendAt
        vuAt 
      entity room 
        list of messages 
        number of users 
        
      
         
