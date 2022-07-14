package peaksoft.airbnbexample.services;

import org.springframework.stereotype.Service;
import peaksoft.airbnbexample.dto.announcement.AnnouncementRequest;
import peaksoft.airbnbexample.dto.announcement.AnnouncementRequest1;
import peaksoft.airbnbexample.dto.announcement.AnnouncementResponse;
import peaksoft.airbnbexample.dto.announcement.AnnouncementResponse1;

/**
 * @author Muhammed Toichubai
 */
@Service
public interface AnnouncementService {
    AnnouncementResponse1 save(AnnouncementRequest1 request, Long userId);

    AnnouncementResponse1 update(Long id, AnnouncementRequest1 request);

    AnnouncementResponse1 findById(Long id);

    AnnouncementResponse1 deleteBy(Long id);
}
