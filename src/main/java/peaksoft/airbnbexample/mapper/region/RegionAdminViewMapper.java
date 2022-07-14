package peaksoft.airbnbexample.mapper.region;

import lombok.Getter;
import lombok.Setter;
import peaksoft.airbnbexample.dto.region.RegionAdminResponse;
import peaksoft.airbnbexample.models.Region;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class RegionAdminViewMapper {
    public RegionAdminResponse viewRegion(Region region){
        if (region == null){
            return null;
        }
        RegionAdminResponse response = new RegionAdminResponse();
        response.setId(region.getId());
        response.setRegionName(region.getRegionName());
        return response;
    }

    public List<RegionAdminResponse> view(List<Region> regions){
        List<RegionAdminResponse> responses = new ArrayList<>();
        for (Region region : regions) {
            responses.add(viewRegion(region));
        }
        return responses;
    }
}
