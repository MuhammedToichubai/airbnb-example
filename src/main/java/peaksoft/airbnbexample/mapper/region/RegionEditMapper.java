package peaksoft.airbnbexample.mapper.region;

import org.springframework.stereotype.Component;
import peaksoft.airbnbexample.dto.request.RegionRequest;
import peaksoft.airbnbexample.models.Region;

@Component
public class RegionEditMapper {

    public Region saveRegion(RegionRequest request) {
        if (request == null) {
            return null;
        }
        Region region = new Region();
        region.setRegionName(request.getRegionName());
        return region;
    }

    public void updateRegion(RegionRequest request, Region region) {
        region.setRegionName(request.getRegionName());
    }
}
