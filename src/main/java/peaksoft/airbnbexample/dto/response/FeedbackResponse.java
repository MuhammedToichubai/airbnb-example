package peaksoft.airbnbexample.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
public class FeedbackResponse {

    private Long id;
    private String feedbackOwnerImage;
    private String feedbackOwnerFullName;
    private Double rating;
    private String description;
    private List<String> images;
    private LocalDate createdAt;
    private Integer like;
    private Integer dislike;
}
