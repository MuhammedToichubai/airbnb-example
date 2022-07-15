package peaksoft.airbnbexample.apis;

import org.springframework.web.bind.annotation.*;
import peaksoft.airbnbexample.dto.request.AnnouncementRequest;
import peaksoft.airbnbexample.dto.response.AnnouncementResponse;
import peaksoft.airbnbexample.dto.response.SimpleResponse;

import java.util.List;

/**
 * @author Muhammed Toichubai
 */
@RestController
@RequestMapping("/api/announcements")
public class AnnouncementAPI {


    //PermitAll
    @GetMapping
    public List<AnnouncementResponse> getAllAnnouncement() {
        return null;
    }

    //PermitAll
    @GetMapping("/findAnnouncementById/{announcementId}")
    public AnnouncementResponse findAnnouncementById(@PathVariable Long announcementId){
        return null;
    }

    //User
    @PostMapping("/saveAnnouncement")
    public AnnouncementResponse saveAnnouncement(@RequestBody AnnouncementRequest announcementRequest){
        return null;
    }

    //User
    @PutMapping("/updateAnnouncement/{announcementId}")
    public AnnouncementResponse updateAnnouncement(@PathVariable Long announcementId,
                                                   @RequestBody AnnouncementRequest announcementRequest){
        return null;
    }

    //Admin, User
    @DeleteMapping("/deleteAnnouncement/{announcementId}")
    public SimpleResponse deleteAnnouncement(@PathVariable Long announcementId){
        return null;
    }
}