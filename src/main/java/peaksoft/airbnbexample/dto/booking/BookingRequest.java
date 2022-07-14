package peaksoft.airbnbexample.dto.booking;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BookingRequest {
    private String checkin;
    private String checkout;
}
