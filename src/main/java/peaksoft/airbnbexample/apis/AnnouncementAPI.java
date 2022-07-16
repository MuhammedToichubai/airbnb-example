package peaksoft.airbnbexample.apis;

import org.springframework.web.bind.annotation.*;
import peaksoft.airbnbexample.dto.request.AnnouncementRequest;
import peaksoft.airbnbexample.dto.request.BookingRequest;
import peaksoft.airbnbexample.dto.response.*;

import java.util.List;

/**
 * @author Muhammed Toichubai
 */
@RestController
@RequestMapping("/api/announcements")
public class AnnouncementAPI {


    //PermitAll  // Search
    @GetMapping
    public List<SimpleAnnouncementResponse> getAllAnnouncements() {
        return null;
    }


    //PermitAll //popular apartments 7
                //popular house 3
                //latest announcements 7
    @GetMapping("/popular")
    public List<PopularAnnouncementResponse> getPopularAnnouncements() {
        return null;
    }


    //PermitAll
    @GetMapping("/find/{announcementId}")
    public AnnouncementInnerPageResponse findAnnouncementById(@PathVariable Long announcementId){
        return null;
    }


    @GetMapping("/feedback/{annoucementId}")
    public List<FeedbackResponse> findFeedbacksByAnnouncement(@PathVariable Long announcementId){
        return null;
    }

    //User
    @PostMapping("/booking/save/{announcementId}")
    public BookingResponse saveBooking(@PathVariable Long announcementId, @RequestBody BookingRequest bookingRequest){
        return null;
    }

//
//    //User
//    @PostMapping("/saveAnnouncement")
//    public AnnouncementResponse saveAnnouncement(@RequestBody AnnouncementRequest announcementRequest){
//        return null;
//    }
//
//    //User
//    @PutMapping("/updateAnnouncement/{announcementId}")
//    public AnnouncementResponse updateAnnouncement(@PathVariable Long announcementId,
//                                                   @RequestBody AnnouncementRequest announcementRequest){
//        return null;
//    }
//
//    //Admin, User
//    @DeleteMapping("/deleteAnnouncement/{announcementId}")
//    public SimpleResponse deleteAnnouncement(@PathVariable Long announcementId){
//        return null;
//    }
}