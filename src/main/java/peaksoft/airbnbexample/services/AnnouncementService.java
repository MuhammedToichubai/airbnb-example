package peaksoft.airbnbexample.services;

import org.springframework.stereotype.Service;
import peaksoft.airbnbexample.dto.announcement.AnnouncementRequest;
import peaksoft.airbnbexample.dto.announcement.AnnouncementResponse;

/**
 * @author Muhammed Toichubai
 */
@Service
public interface AnnouncementService {
    AnnouncementResponse save(AnnouncementRequest request, Long userId);
}
