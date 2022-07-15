package peaksoft.airbnbexample.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserResponse {
    private String fullName;
    private String email;
    private Integer bookings;
    private Integer announcement;

}
