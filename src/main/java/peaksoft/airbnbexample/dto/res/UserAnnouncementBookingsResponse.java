package peaksoft.airbnbexample.dto.res;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter
public class UserAnnouncementBookingsResponse {
    private Long bookingId;
    private BigDecimal price;
    private String checkIn;
    private String checkOut;
    private String userImage;
    private String userFullName;
    private String userEmail;


}
