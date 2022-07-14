package peaksoft.airbnbexample.mapper.feedback;

import org.springframework.stereotype.Component;
import peaksoft.airbnbexample.dto.feedback.FeedbackRequest;
import peaksoft.airbnbexample.models.Feedback;

@Component
public class FeedbackEditMapper {
    public Feedback saveFeedback(FeedbackRequest request){
        if (request == null){
            return null;
        }
        Feedback feedback = new Feedback();
        feedback.setImages(request.getImages());
        feedback.setDescription(request.getDescription());
        feedback.setLike(request.getLikes());
        feedback.setDislike(request.getDislikes());
        feedback.setRating(request.getRatings());

        return feedback;

    }

    public void updateFeedback(Feedback feedback, FeedbackRequest request){
        feedback.setImages(request.getImages());
        feedback.setDescription(request.getDescription());
        feedback.setLike(request.getLikes());
        feedback.setDislike(request.getDislikes());
        feedback.setRating(request.getRatings());
    }
}