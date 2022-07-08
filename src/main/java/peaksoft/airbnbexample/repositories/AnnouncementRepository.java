package peaksoft.airbnbexample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.airbnbexample.models.Announcement;

public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {
}