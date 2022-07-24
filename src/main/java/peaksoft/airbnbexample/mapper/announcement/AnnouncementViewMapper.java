package peaksoft.airbnbexample.mapper.announcement;

import org.springframework.stereotype.Component;
import peaksoft.airbnbexample.dto.response.AnnouncementInnerPageResponse;
import peaksoft.airbnbexample.models.Announcement;

@Component
public class AnnouncementViewMapper {

    public AnnouncementInnerPageResponse viewAnnouncementInnerPageResponse(Announcement announcement) {
        if (announcement == null) {
            return null;
        }
        AnnouncementInnerPageResponse response = new AnnouncementInnerPageResponse();
        response.setId(announcement.getId());
        response.setImages(announcement.getImages());
        response.setHouseType(announcement.getHouseType());
        response.setMaxGuests(announcement.getMaxGuests());
        response.setTitle(announcement.getTitle());
        response.setLocation(announcement.getLocation().getAddress());
        response.setDescription(announcement.getDescription());
        response.setOwnerImage(announcement.getOwner().getImage());
        response.setOwnerFullName(announcement.getOwner().getFullName());
        response.setOwnerEmail(announcement.getOwner().getEmail());
        return response;
    }

}
