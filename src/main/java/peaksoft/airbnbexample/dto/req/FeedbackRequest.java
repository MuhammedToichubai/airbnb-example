package peaksoft.airbnbexample.dto.req;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class FeedbackRequest {
    private List<String> images;
    private Integer rating;
    private String description;
}
