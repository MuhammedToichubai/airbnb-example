package peaksoft.airbnbexample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.airbnbexample.models.Region;

public interface RegionRepository extends JpaRepository<Region, Long> {
}