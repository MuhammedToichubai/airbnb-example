package peaksoft.airbnbexample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.airbnbexample.models.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}