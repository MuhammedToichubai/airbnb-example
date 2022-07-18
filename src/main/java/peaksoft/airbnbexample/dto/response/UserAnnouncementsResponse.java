package peaksoft.airbnbexample.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter
public class UserAnnouncementsResponse {
    private Long announcementId;
    private String image;
    private BigDecimal price;
    private Double rating;
    private String title;
    private String location;
    private Integer maxGuests;
}
