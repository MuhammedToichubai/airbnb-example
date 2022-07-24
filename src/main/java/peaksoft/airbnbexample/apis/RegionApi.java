package peaksoft.airbnbexample.apis;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.airbnbexample.dto.response.RegionResponse;
import peaksoft.airbnbexample.dto.res.AdminAnnouncementResponse;
import peaksoft.airbnbexample.services.RegionService;


import java.util.List;

@RestController
@RequestMapping("/api/regions")
public class RegionApi {

    private final RegionService regionService;

    public RegionApi(RegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping
    public List<RegionResponse> getAllRegions(){
        return regionService.getAllRegions();
    }

    @GetMapping("find/{regionId}")
    public RegionResponse findById(@PathVariable Long regionId){
        return regionService.findByIdRegion(regionId);
    }

    @GetMapping("announcements/{regionId}")
    public List<AdminAnnouncementResponse> getRegionAnnouncements(@PathVariable Long regionId) {
        return null;
    }
}
