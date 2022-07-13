package peaksoft.airbnbexample.apis;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.airbnbexample.dto.announcement.AnnouncementRequest;
import peaksoft.airbnbexample.dto.announcement.AnnouncementResponse;
import peaksoft.airbnbexample.services.AnnouncementService;

import java.util.List;

/**
 * @author Muhammed Toichubai
 */
@RestController
@RequestMapping("/api/announcements")
public class AnnouncementAPI {

    private final AnnouncementService announcementService;

    public AnnouncementAPI(AnnouncementService service) {
        this.announcementService = service;
    }

    @GetMapping
    public List<AnnouncementResponse> getAll(){
        return null;
    }

//    @PostMapping("/save")
//    public AnnouncementResponse save(@RequestBody AnnouncementRequest request) {
//        return announcementService.save(request);
//    }
//
//    @PutMapping("/update/{id}")
//    public AnnouncementResponse update(@PathVariable Long id, @RequestBody AnnouncementRequest request) {
//        return announcementService.update(id, request);
//    }
//
//    @GetMapping("/findById/{id}")
//    public AnnouncementResponse findById(@PathVariable Long id) {
//        return announcementService.findById(id);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public AnnouncementResponse deleteCompanyById(@PathVariable Long id) {
//        return announcementService.deleteBy(id);
//    }

}
