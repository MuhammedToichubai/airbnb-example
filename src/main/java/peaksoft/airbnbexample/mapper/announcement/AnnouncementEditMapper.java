package peaksoft.airbnbexample.mapper.announcement;

import org.springframework.stereotype.Component;
import peaksoft.airbnbexample.dto.request.AnnouncementRequest;
import peaksoft.airbnbexample.models.Announcement;

import java.time.LocalDate;

@Component
public class AnnouncementEditMapper {

    public Announcement saveAnnouncement(AnnouncementRequest request) {
        if (request == null) {
            return null;
        }
        Announcement announcement = new Announcement();
        AnnouncementRequestToAnnouncement(request, announcement);

        return announcement;
    }

    public void updateAnnouncement(Announcement announcement, AnnouncementRequest request) {

        AnnouncementRequestToAnnouncement(request, announcement);

    }

    private void AnnouncementRequestToAnnouncement(AnnouncementRequest request, Announcement announcement) {

        announcement.setTitle(request.getTitle());
        announcement.setDescription(request.getDescription());
        announcement.setImages(request.getImages());
        announcement.setStatus(announcement.getStatus());
        announcement.setPrice(request.getPrice());
        announcement.setMaxGuests(request.getMaxGuests());
        announcement.setHouseType(request.getHouseType());
        announcement.setCreatedAt(LocalDate.now());
    }
}
