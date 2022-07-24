package peaksoft.airbnbexample.services;

import org.springframework.stereotype.Service;
import peaksoft.airbnbexample.dto.request.AnnouncementRequest;
import peaksoft.airbnbexample.dto.response.AnnouncementInnerPageResponse;
import peaksoft.airbnbexample.dto.response.SimpleResponse;

@Service
public interface AnnouncementService {

    SimpleResponse announcementSave(AnnouncementRequest request);

    AnnouncementInnerPageResponse announcementFindById(Long announcementId);

    SimpleResponse announcementUpdate(Long id, AnnouncementRequest request);

    SimpleResponse announcementDelete(Long announcementId);
}
