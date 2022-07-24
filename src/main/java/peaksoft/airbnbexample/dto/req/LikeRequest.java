package peaksoft.airbnbexample.dto.req;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LikeRequest {

    private Long feedbackId;
    private Integer like;
    private Integer dislike;
}
