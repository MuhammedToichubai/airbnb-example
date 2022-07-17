package peaksoft.airbnbexample.apis;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.airbnbexample.dto.response.RegionResponse;
import peaksoft.airbnbexample.dto.response.SimpleAnnouncementResponse;


import java.util.List;

@RestController
@RequestMapping("/api/regions")
public class RegionApi {

    @GetMapping
    public List<RegionResponse> getAllRegions(){return null;}

    @GetMapping("find/{regionId}")
    public RegionResponse findById(@PathVariable Long regionId){return null;}

    @GetMapping("announcements/{regionId}")
    public List<SimpleAnnouncementResponse> getRegionAnnouncements(@PathVariable Long regionId) {
        return null;
    }
}
