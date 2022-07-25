package peaksoft.airbnbexample.dto.res;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserResponse {

    private Long userId;
    private String image;
    private String fullName;
    private String email;


}
