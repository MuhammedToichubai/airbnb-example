package peaksoft.airbnbexample.apis;

import org.springframework.web.bind.annotation.*;
import peaksoft.airbnbexample.dto.request.AcceptRequest;
import peaksoft.airbnbexample.dto.request.BlockRequest;
import peaksoft.airbnbexample.dto.request.SimpleRequest;
import peaksoft.airbnbexample.dto.response.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
//ADMIN
public class AdminAPI {


    @GetMapping("/application")
    public List<SimpleAnnouncementResponse> getAllAnnouncements(){
        return null;
    }

    @PutMapping("/change/status/{announcementId}")
    public SimpleResponse changeStatusAnnouncement(@PathVariable Long announcementId){
        return null;
    }
    @PostMapping("/change/status/{announcementId}")
    public SimpleResponse changeStatusAnnouncement(@RequestBody SimpleRequest request, @PathVariable Long announcementId){
        return null;
    }

    @GetMapping("/users")
    public List<UserListResponse> getAllUsers(){
        return null;
    }
    @DeleteMapping("/user/delete/{userId}")
    public SimpleResponse deleteUser(@PathVariable Long userId){
        return null;
    }

    @DeleteMapping("/user/announcement/delete/{announcementId}")
    public SimpleResponse deleteUserAnnouncement(@PathVariable Long announcementId){
        return null;
    }

    @PostMapping("/block/user/announcements")
    public SimpleResponse blockUserAnnouncements(@RequestBody List<BlockRequest> blockRequests) {
        return null;
    }

    @GetMapping("/all/housing")
    public List<UserAnnouncementResponse> getAllHousing(){
        return null;
    }

}
