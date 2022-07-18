package peaksoft.airbnbexample.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.airbnbexample.dto.response.UserResponse;

/**
 * @author Altynbek Mamasadykov
 */

@RestController
@RequestMapping("/api/user")
public class UserApi {

    @GetMapping("{profile/userId}")
    public UserResponse viewUserProfile(@PathVariable Long userId){
        return null;
    }



}
