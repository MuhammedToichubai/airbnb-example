package peaksoft.airbnbexample.dto.feedback;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
public class FeedbackResponse {
    private Long id;
    private List<String> images;
    private String description;
    private Integer like;
    private Integer dislike;
    private Integer rating;
    private Long announcementId;
    private LocalDate createdAt;
}
