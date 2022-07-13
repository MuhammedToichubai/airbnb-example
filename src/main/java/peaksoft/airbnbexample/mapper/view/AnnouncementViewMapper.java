package peaksoft.airbnbexample.mapper.view;

import org.springframework.stereotype.Component;
import peaksoft.airbnbexample.dto.announcement.AnnouncementResponse1;
import peaksoft.airbnbexample.models.Announcement;

import java.util.ArrayList;
import java.util.List;

@Component
public class AnnouncementViewMapper {
    public AnnouncementResponse1 viewAnnouncement(Announcement announcement) {
        if (announcement == null) {
            return null;
        }
        AnnouncementResponse1 response1 = new AnnouncementResponse1();
        response1.setId(announcement.getId());
        response1.setStatus(announcement.getStatus()); //OLD status Beksultan
        response1.setImages(announcement.getImages());
        response1.setHouseType(announcement.getHouseType());
        response1.setMaxGuests(announcement.getMaxGuests());
        response1.setPrice(announcement.getPrice());
        response1.setTitle(announcement.getTitle());
        response1.setDescription(announcement.getDescription());
        response1.setCreatedAt(announcement.getCreatedAt());

        return response1;
    }

    public List<AnnouncementResponse1> view(List<Announcement> announcements) {
        List<AnnouncementResponse1> response1s = new ArrayList<>();
        for (Announcement response : announcements) {
            response1s.add(viewAnnouncement(response));
        }
        return response1s;
    }
}
