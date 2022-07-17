package peaksoft.airbnbexample.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class FeedbackRequest {
    private List<String> images;
    private String description;
    private Integer rating;
    private Long announcementId;
}
