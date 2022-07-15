package peaksoft.airbnbexample.mapper.announcement;

import org.springframework.stereotype.Component;
import peaksoft.airbnbexample.dto.request.AnnouncementRequest;
import peaksoft.airbnbexample.models.Address;
import peaksoft.airbnbexample.models.Announcement;
import peaksoft.airbnbexample.models.Region;
import peaksoft.airbnbexample.models.enums.Status;

import java.time.LocalDate;

@Component
public class AnnouncementEditMapper {

    public Announcement saveAnnouncement(AnnouncementRequest request1){
        if (request1 == null){
            return null;
        }
        Announcement announcement = new Announcement();
        AnnouncementRequestToAnnouncement(request1, announcement);

        return announcement;
    }

    public void updateAnnouncement(Announcement announcement, AnnouncementRequest request1){
        AnnouncementRequestToAnnouncement(request1, announcement);

    }

    private void AnnouncementRequestToAnnouncement(AnnouncementRequest request1, Announcement announcement) {
        announcement.setImages(request1.getImages());
        announcement.setHouseType(request1.getHouseType());
        announcement.setMaxGuests(request1.getMaxGuests());
        announcement.setPrice(request1.getPrice());
        announcement.setTitle(request1.getTitle());
        announcement.setDescription(request1.getDescription());
        Address address = new Address();
        address.setAddress(request1.getAddress());
        address.setTownProvince(request1.getTownProvince());
        Region region = new Region();
        region.setRegionName(request1.getRegion());
        address.setRegion(region);
        announcement.setLocation(address);
        announcement.setStatus(Status.NEW);
        announcement.setCreatedAt(LocalDate.now());

    }
}
