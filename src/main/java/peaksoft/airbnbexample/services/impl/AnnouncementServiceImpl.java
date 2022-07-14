package peaksoft.airbnbexample.services.impl;

import org.springframework.stereotype.Service;
import peaksoft.airbnbexample.dto.announcement.AnnouncementRequest1;
import peaksoft.airbnbexample.dto.announcement.AnnouncementResponse1;
import peaksoft.airbnbexample.exceptions.NotFoundException;
import peaksoft.airbnbexample.mapper.announcement.AnnouncementEditMapper;
import peaksoft.airbnbexample.mapper.announcement.AnnouncementViewMapper;
import peaksoft.airbnbexample.models.Announcement;
import peaksoft.airbnbexample.models.auth.User;
import peaksoft.airbnbexample.repositories.AnnouncementRepository;
import peaksoft.airbnbexample.repositories.UserRepository;
import peaksoft.airbnbexample.services.AnnouncementService;

/**
 * @author Muhammed Toichubai
 */
@Service
public class AnnouncementServiceImpl implements AnnouncementService {

    private final AnnouncementRepository announcementRepository;
    private final AnnouncementEditMapper editMapper;
    private final AnnouncementViewMapper viewMapper;
    private final UserRepository userRepository;


    public AnnouncementServiceImpl(AnnouncementRepository announcementRepository, AnnouncementEditMapper editMapper, AnnouncementViewMapper viewMapper, UserRepository userRepository) {
        this.announcementRepository = announcementRepository;
        this.editMapper = editMapper;
        this.viewMapper = viewMapper;
        this.userRepository = userRepository;
    }

    @Override
    public AnnouncementResponse1 save(AnnouncementRequest1 request, Long userId) {
        Announcement announcement = editMapper.saveAnnouncement(request);
        User user = userRepository.findById(userId).orElseThrow(() -> new NotFoundException(
                "User whit id = " + userId + " not found!"
        ));
        announcement.setOwner(user);
        announcementRepository.save(announcement);
        return viewMapper.viewAnnouncement(announcement);
    }

    @Override
    public AnnouncementResponse1 update(Long id, AnnouncementRequest1 request) {
        return null;
    }

    @Override
    public AnnouncementResponse1 findById(Long id) {
        return null;
    }

    @Override
    public AnnouncementResponse1 deleteBy(Long id) {
        return null;
    }
}
