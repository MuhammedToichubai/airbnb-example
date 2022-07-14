package peaksoft.airbnbexample.apis;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import peaksoft.airbnbexample.dto.announcement.AnnouncementRequest1;
import peaksoft.airbnbexample.dto.announcement.AnnouncementResponse1;
import peaksoft.airbnbexample.services.AnnouncementService;

import java.util.List;

/**
 * @author Muhammed Toichubai
 */
@RestController
@RequestMapping("/api/announcements")
public class AnnouncementAPI {

    private final AnnouncementService announcementService;

    public AnnouncementAPI(@Qualifier("announcementService") AnnouncementService service) {
        this.announcementService = service;
    }

    @GetMapping
    public List<AnnouncementResponse1> getAll() {
        return null;
    }

    @PostMapping("/save/{userId}")
    public AnnouncementResponse1 save(@RequestBody AnnouncementRequest1 request, @PathVariable Long userId) {
        return announcementService.save(request, userId);
    }

    @PutMapping("/update/{id}")
    public AnnouncementResponse1 update(@PathVariable Long id, @RequestBody AnnouncementRequest1 request) {
        return announcementService.update(id, request);
    }

    @GetMapping("/findById/{id}")
    public AnnouncementResponse1 findById(@PathVariable Long id) {
        return announcementService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public AnnouncementResponse1 deleteCompanyById(@PathVariable Long id) {
        return announcementService.deleteBy(id);
    }
}
