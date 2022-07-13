package peaksoft.airbnbexample.dto.user;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Muhammed Toichubai
 */
@Getter @Setter
public class UserResponse {
    private Long id;
    private String JWToken;
    private String role;
}
