package peaksoft.airbnbexample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import peaksoft.airbnbexample.models.Announcement;

public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {
    @Modifying
    @Query("delete from Announcement a where a.id = ?1")
    void deleteAnnouncementById(Long id);
}