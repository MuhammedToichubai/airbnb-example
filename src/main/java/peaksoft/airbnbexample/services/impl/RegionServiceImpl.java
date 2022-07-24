package peaksoft.airbnbexample.services.impl;

import org.springframework.stereotype.Service;
import peaksoft.airbnbexample.dto.request.RegionRequest;
import peaksoft.airbnbexample.dto.response.RegionResponse;
import peaksoft.airbnbexample.dto.response.SimpleResponse;
import peaksoft.airbnbexample.exceptions.BadRequestException;
import peaksoft.airbnbexample.exceptions.NotFoundException;
import peaksoft.airbnbexample.mapper.region.RegionViewMapper;
import peaksoft.airbnbexample.models.Region;
import peaksoft.airbnbexample.repositories.RegionRepository;
import peaksoft.airbnbexample.services.RegionService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {

    private final RegionRepository regionRepository;
    private final RegionViewMapper regionViewMapper;


    public RegionServiceImpl(RegionRepository regionRepository, RegionViewMapper regionViewMapper) {
        this.regionRepository = regionRepository;
        this.regionViewMapper = regionViewMapper;
    }

    @PostConstruct
    public void savedRegions() {
        List<Region> regions = new ArrayList<>(List.of(

                new Region("Batken"),
                new Region("Jalalabat"),
                new Region("Naryn"),
                new Region("Issyk-kul"),
                new Region("Talas"),
                new Region("Osh"),
                new Region("Chui"),
                new Region("Bishkek")
        ));
        regionRepository.saveAll(regions);
    }

    @Override
    public SimpleResponse saveRegion(RegionRequest request) {
        return null;
    }

    @Override
    public List<RegionResponse> getAllRegions() {
        List<Region> allRegions = regionRepository.findAll();
        return regionViewMapper.view(allRegions);
    }

    @Override
    public RegionResponse findByIdRegion(Long regionId) {
        if (regionId <= 0) {
            throw new BadRequestException("Id cannot be negative and null !");
        }
        Region region = regionRepository.findById(regionId).orElseThrow(() ->
                new NotFoundException(
                        "Region whit id = " + regionId + " not found!"
                ));
        return regionViewMapper.viewRegion(region);
    }
}
