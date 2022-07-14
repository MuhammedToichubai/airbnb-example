package peaksoft.airbnbexample.dto.feedback;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class FeedbackRequest {
    private List<String> images;
    private String description;
    private Integer like;
    private Integer dislike;
    private Integer rating;
}
