package peaksoft.airbnbexample.apis;

import org.springframework.web.bind.annotation.*;
import peaksoft.airbnbexample.dto.request.AnnouncementRequest;
import peaksoft.airbnbexample.dto.req.BookingRequest;
import peaksoft.airbnbexample.dto.res.*;
import peaksoft.airbnbexample.dto.response.AnnouncementInnerPageResponse;
import peaksoft.airbnbexample.dto.response.SimpleResponse;
import peaksoft.airbnbexample.exceptions.NotFoundException;
import peaksoft.airbnbexample.services.AnnouncementService;

@RestController
@RequestMapping("/api/announcements")
public class AnnouncementAPI {

    private final AnnouncementService announcementService;

    public AnnouncementAPI(AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }

    //User
    @PostMapping("/save")
    public SimpleResponse saveAnnouncement(@RequestBody AnnouncementRequest announcementRequest) {
        return announcementService.announcementSave(announcementRequest) ;
    }

    //Admin , User
    @GetMapping("/find/{announcementId}")
    public AnnouncementInnerPageResponse findAnnouncementById(@PathVariable Long announcementId) {
        return announcementService.announcementFindById(announcementId);
    }


    //User //Admin
    @PutMapping("/update/{announcementId}")
    public SimpleResponse updateAnnouncement(@PathVariable Long announcementId,
                                             @RequestBody AnnouncementRequest announcementRequest) {
        return announcementService.announcementUpdate(announcementId, announcementRequest);
    }

    @DeleteMapping("/delete/{announcementId}")
    public SimpleResponse deleteAnnouncement(@PathVariable Long announcementId){
        return announcementService.announcementDelete(announcementId);
    }

        //User
    @PostMapping("/booking/save/{announcementId}")
    public BookingResponse saveBooking(@PathVariable Long announcementId, @RequestBody BookingRequest bookingRequest) {
        return null;
    }

    @GetMapping("/rating/{announcementId}")
    public RatingResponse announcementRatingStatics(@PathVariable Long announcementId) {
        return null;
    }


}