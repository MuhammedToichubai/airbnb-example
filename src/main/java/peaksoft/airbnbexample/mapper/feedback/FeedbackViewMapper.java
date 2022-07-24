package peaksoft.airbnbexample.mapper.feedback;

import org.springframework.stereotype.Component;
import peaksoft.airbnbexample.dto.res.FeedbackResponse;
import peaksoft.airbnbexample.models.Feedback;

@Component
public class FeedbackViewMapper {
    public FeedbackResponse viewFeedback(Feedback feedback) {
        if (feedback == null) {
            return null;
        }
        FeedbackResponse response = new FeedbackResponse();
        response.setId(feedback.getId());
        response.setImages(feedback.getImages());
        response.setDescription(feedback.getDescription());
        response.setLike(feedback.getLike());
        response.setDislike(feedback.getDislike());
        response.setRating(feedback.getRating());

        return response;
    }
}
