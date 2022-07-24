package peaksoft.airbnbexample.services;

import peaksoft.airbnbexample.dto.request.RegionRequest;
import peaksoft.airbnbexample.dto.response.RegionResponse;
import peaksoft.airbnbexample.dto.response.SimpleResponse;

import java.util.List;

public interface RegionService {

    SimpleResponse saveRegion(RegionRequest request);

    List<RegionResponse> getAllRegions();

    RegionResponse findByIdRegion(Long regionId);
}
