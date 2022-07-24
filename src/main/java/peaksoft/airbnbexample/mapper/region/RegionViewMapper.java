package peaksoft.airbnbexample.mapper.region;

import org.springframework.stereotype.Component;
import peaksoft.airbnbexample.dto.response.RegionResponse;
import peaksoft.airbnbexample.models.Region;

import java.util.ArrayList;
import java.util.List;

@Component
public class RegionViewMapper {
    public RegionResponse viewRegion(Region region) {
        if (region == null) {
            return null;
        }
        RegionResponse response = new RegionResponse();
        response.setId(region.getId());
        response.setRegionName(region.getRegionName());
        return response;
    }

    public List<RegionResponse> view(List<Region> regions) {
        List<RegionResponse> responses = new ArrayList<>();
        for (Region region : regions) {
            responses.add(viewRegion(region));
        }
        return responses;
    }
}
