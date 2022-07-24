package peaksoft.airbnbexample.dto.res;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Muhammed Toichubai
 */
@Getter @Setter
public class AuthResponse {
    private Long id;
    private String JWToken;
    private String role;
}
