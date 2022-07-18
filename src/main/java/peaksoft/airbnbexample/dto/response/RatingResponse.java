package peaksoft.airbnbexample.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RatingResponse {
    Double averageRating;
    Integer rating5;
    Integer rating4;
    Integer rating3;
    Integer rating2;
    Integer rating1;
}
