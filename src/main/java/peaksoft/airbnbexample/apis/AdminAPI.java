package peaksoft.airbnbexample.apis;

import org.springframework.web.bind.annotation.*;
import peaksoft.airbnbexample.dto.request.AcceptRequest;
import peaksoft.airbnbexample.dto.request.BlockRequest;
import peaksoft.airbnbexample.dto.response.AcceptResponse;
import peaksoft.airbnbexample.dto.response.AnnouncementResponse;
import peaksoft.airbnbexample.dto.response.SimpleResponse;
import peaksoft.airbnbexample.dto.response.UserResponse;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
//ADMIN
public class AdminAPI {

    @GetMapping("/getAllAnnouncement")
    public List<AnnouncementResponse> getAllAnnouncement() {
        return null;
    }

    @GetMapping("/findById/{announcementId}")
    public AnnouncementResponse findByIdAnnouncement(@PathVariable Long announcementId) {
        return null;
    }

    @PostMapping("/accept/reject")
    public AcceptResponse acceptOrReject(@RequestBody AcceptRequest request) {
        return null;
    }

    @GetMapping("/allUsers}")
    public List<UserResponse> getAllUsers() {
        return null;
    }

    @DeleteMapping("/deleteUser/{userId}")
    public SimpleResponse deleteUser(@PathVariable Long userId) {
        return null;
    }

    //Admin, User
    @GetMapping("user/allAnnouncemet/{userId}")
    public List<AnnouncementResponse> userGetAllAnnouncement(@PathVariable Long userId) {
        return null;
    }

    @PostMapping("block/user/announcements")
    public SimpleResponse blockAnnouncements(@RequestBody List<BlockRequest> blockRequests) {
        return null;
    }


}
