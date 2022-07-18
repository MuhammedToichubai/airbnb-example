package peaksoft.airbnbexample.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter
public class BookingResponse {
    private Long bookingId;
    private BigDecimal AnnouncementPrice;
    private String checkin;
    private String checkout;
    private Long userId;
    private Long announcementId;

}
