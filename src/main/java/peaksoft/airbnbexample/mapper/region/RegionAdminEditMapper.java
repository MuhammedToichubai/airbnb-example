package peaksoft.airbnbexample.mapper.region;

import org.springframework.stereotype.Component;
import peaksoft.airbnbexample.dto.region.RegionAdminRequest;
import peaksoft.airbnbexample.models.Region;

@Component
public class RegionAdminEditMapper {

    public Region saveRegion(RegionAdminRequest request){
        if (request == null){
            return null;
        }
        Region region = new Region();
        region.setRegionName(request.getRegionName());
        return region;
    }

    public void updateRegion (RegionAdminRequest request, Region region){
        region.setRegionName(request.getRegionName());
    }
}
