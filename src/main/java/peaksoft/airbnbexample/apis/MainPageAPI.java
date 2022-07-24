package peaksoft.airbnbexample.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.airbnbexample.dto.res.*;

import java.util.List;

@RestController
@RequestMapping("/api/announcement")
public class MainPageAPI {
    //PermitAll  // Search
    @GetMapping("/search")
    public List<UserAnnouncementsResponse> getAllAnnouncements() {
        return null;
    }

    //PermitAll //popular apartments 7
    @GetMapping("/popular/apartments")
    public List<PopularApartmentResponse> getPopularApartments() {
        return null;
    }

    //popular house 3
    @GetMapping("/popular/houses")
    public List<PopularHousesResponse> getPopularHouses() {
        return null;
    }

    //latest announcements 7
    @GetMapping("/popular/latest")
    public List<LatestAnnouncementResponse> getPopularAnnouncements() {
        return null;
    }

}
