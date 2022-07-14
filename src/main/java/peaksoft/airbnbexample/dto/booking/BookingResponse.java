package peaksoft.airbnbexample.dto.booking;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BookingResponse {
    private Long id;
    private String checkin;
    private String checkout;

}
