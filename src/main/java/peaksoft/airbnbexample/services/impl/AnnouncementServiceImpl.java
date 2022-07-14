package peaksoft.airbnbexample.services.impl;

import peaksoft.airbnbexample.dto.announcement.AnnouncementRequest;
import peaksoft.airbnbexample.dto.announcement.AnnouncementResponse;
import peaksoft.airbnbexample.repositories.AnnouncementRepository;
import peaksoft.airbnbexample.services.AnnouncementService;

/**
 * @author Muhammed Toichubai
 */
public class AnnouncementServiceImpl implements AnnouncementService {

    private final AnnouncementRepository announcementRepository;

    public AnnouncementServiceImpl(AnnouncementRepository announcementRepository) {
        this.announcementRepository = announcementRepository;
    }

    @Override
    public AnnouncementResponse save(AnnouncementRequest request, Long userId) {
        return null;
    }
}
