package peaksoft.airbnbexample.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BookingResponse {

    private Long id;
    private String checkin;
    private String checkout;
    private Long userId;
    private Long announcementId;

}
