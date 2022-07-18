package peaksoft.airbnbexample.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.airbnbexample.dto.response.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserAPI {

    @GetMapping("/profile/{userId}")
    public UserResponse viewUserProfile(@PathVariable Long userId){
        return null;
    }
    @GetMapping("/bookings/{announcementId}")
    public List<UserBookingsResponse> getUserAllBookings(@PathVariable Long announcementId){
        return null;
    }

    @GetMapping("/my/announcements/{announcementId}")
    public List<UserAnnouncementsResponse> getAllUserAnnouncements(@PathVariable Long announcementId){
        return null;
    }

    @GetMapping("/announcement/find/{announcementId}")
    public UserAnnouncementResponse findUserAnnouncement(@PathVariable Long announcementId){
        return null;
    }

    @GetMapping("/announcement/{announcementId}/bookings")
    public List<UserAnnouncementBookingsResponse> getAllUserAnnouncementBookings(@PathVariable Long announcementId){
        return null;
    }



}
