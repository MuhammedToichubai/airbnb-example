package peaksoft.airbnbexample.apis;

import org.springframework.web.bind.annotation.*;
import peaksoft.airbnbexample.dto.request.FeedbackRequest;
import peaksoft.airbnbexample.dto.request.LikeRequest;
import peaksoft.airbnbexample.dto.response.FeedbackResponse;
import peaksoft.airbnbexample.dto.response.SimpleResponse;

@RestController
@RequestMapping
public class FeedbackAPI {


    //User
    @PostMapping("/like/dislike")
    public FeedbackResponse saveLikesFeedback(@RequestBody LikeRequest likeRequest){
        return null;
    }
    //User
    @DeleteMapping("/deleteFeedback/{feedbackId}")
    public SimpleResponse deleteFeedback(@PathVariable Long feedbackId){
        return null;
    }







}
