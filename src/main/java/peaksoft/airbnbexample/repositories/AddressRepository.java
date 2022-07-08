package peaksoft.airbnbexample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.airbnbexample.models.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}