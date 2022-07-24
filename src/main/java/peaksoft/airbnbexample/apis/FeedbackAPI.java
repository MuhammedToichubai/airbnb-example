package peaksoft.airbnbexample.apis;

import org.springframework.web.bind.annotation.*;
import peaksoft.airbnbexample.dto.req.FeedbackRequest;
import peaksoft.airbnbexample.dto.req.LikeRequest;
import peaksoft.airbnbexample.dto.res.FeedbackResponse;
import peaksoft.airbnbexample.dto.response.SimpleResponse;

import java.util.List;

@RestController
@RequestMapping
public class FeedbackAPI {

    //User
    @GetMapping("/feedbacks/{announcementId}")
    public List<FeedbackResponse> getAllAnnouncementFeedbacks(@PathVariable Long announcementId) {
        return null;
    }

    //User
    @PostMapping("/leave/feedback/{announcementId}")
    public FeedbackResponse leaveFeedback(@RequestBody FeedbackRequest feedbackRequest, @PathVariable Long announcementId) {
        return null;
    }

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
