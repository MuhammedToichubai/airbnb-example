package peaksoft.airbnbexample.services;

import org.springframework.stereotype.Service;
import peaksoft.airbnbexample.dto.request.AnnouncementRequest;
import peaksoft.airbnbexample.dto.response.AnnouncementResponse;

/**
 * @author Muhammed Toichubai
 */
@Service
public interface AnnouncementService {
    AnnouncementResponse save(AnnouncementRequest request, Long userId);

    AnnouncementResponse update(Long id, AnnouncementRequest request);

    AnnouncementResponse findById(Long id);

    AnnouncementResponse deleteBy(Long id);
}
