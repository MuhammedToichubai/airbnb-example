//import org.springframework.stereotype.Component;
//import peaksoft.airbnbexample.dto.res.AdminAnnouncementResponse;
//import peaksoft.airbnbexample.dto.res.AnnouncementResponse;
//import peaksoft.airbnbexample.models.Announcement;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class AnnouncementListViewMapper {
//
//    public AdminAnnouncementResponse viewAdminAnnouncementResponse(Announcement announcement) {
//        if (announcement == null) {
//            return null;
//        }
//        AdminAnnouncementResponse response = new AdminAnnouncementResponse();
//        response.setAnnouncementId(announcement.getId());
//        response.setTitle(announcement.getTitle());
//        response.setImages(announcement.getImages());
//        response.setPrice(announcement.getPrice());
//        response.setMaxGuests(announcement.getMaxGuests());
//        response.setRating(5.5);
//        response.setLocation(announcement.getLocation().getAddress());
//        response.setStatus(announcement.getStatus());
//        return response;
//    }
//
//    public AnnouncementResponse viewUserAnnouncementResponse(Announcement announcement) {
//        if (announcement == null) {
//            return null;
//        }
//        AnnouncementResponse response1 = new AnnouncementResponse();
//        response1.setId(announcement.getId());
//        response1.setTitle(announcement.getTitle());
//        response1.setDescription(announcement.getDescription());
//        response1.setImages(announcement.getImages());
//        response1.setStatus(announcement.getStatus()); //OLD status Beksultan
//        response1.setPrice(announcement.getPrice());
//        response1.setMaxGuests(announcement.getMaxGuests());
//        response1.setHouseType(announcement.getHouseType());
//        response1.setRegion(announcement.getLocation().getRegion().getRegionName());
//        response1.setTownProvince(announcement.getLocation().getTownProvince());
//        response1.setAddress(announcement.getLocation().getAddress());
//
//        response1.setCreatedAt(announcement.getCreatedAt());
//
//        return response1;
//    }
//
//    public List<AnnouncementResponse> viewAnnouncementListUserPage(List<Announcement> announcements) {
//        List<AnnouncementResponse> response1s = new ArrayList<>();
//        for (Announcement response : announcements) {
//            response1s.add(viewUserAnnouncementResponse(response));
//        }
//        return response1s;
//    }
//
//    public List<AdminAnnouncementResponse> viewAnnouncementListAdminPage(List<Announcement> announcements) {
//        List<AdminAnnouncementResponse> announcementResponses = new ArrayList<>();
//        for (Announcement response : announcements) {
//            announcementResponses.add(viewAdminAnnouncementResponse(response));
//        }
//        return announcementResponses;
//    }
//
//
//}
