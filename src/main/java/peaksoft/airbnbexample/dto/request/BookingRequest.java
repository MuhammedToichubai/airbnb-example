package peaksoft.airbnbexample.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BookingRequest {
    private String checkin;
    private String checkout;
}
