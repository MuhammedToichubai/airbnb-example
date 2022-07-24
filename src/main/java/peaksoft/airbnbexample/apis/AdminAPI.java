package peaksoft.airbnbexample.apis;

import org.springframework.web.bind.annotation.*;
import peaksoft.airbnbexample.dto.req.BlockRequest;
import peaksoft.airbnbexample.dto.req.SimpleRequest;
import peaksoft.airbnbexample.dto.res.*;
import peaksoft.airbnbexample.dto.response.SimpleResponse;
import peaksoft.airbnbexample.services.AnnouncementService;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
//ADMIN
public class AdminAPI {

    private final AnnouncementService announcementService;

    public AdminAPI(AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }

    @GetMapping("/application")
    public List<AdminAnnouncementResponse> getAllAnnouncements(){
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
