package peaksoft.airbnbexample.services.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import peaksoft.airbnbexample.dto.request.AnnouncementRequest;
import peaksoft.airbnbexample.dto.response.AnnouncementInnerPageResponse;
import peaksoft.airbnbexample.dto.response.SimpleResponse;
import peaksoft.airbnbexample.exceptions.BadRequestException;
import peaksoft.airbnbexample.exceptions.ForbiddenException;
import peaksoft.airbnbexample.exceptions.NotFoundException;
import peaksoft.airbnbexample.mapper.announcement.AnnouncementEditMapper;
import peaksoft.airbnbexample.mapper.announcement.AnnouncementViewMapper;
import peaksoft.airbnbexample.models.Address;
import peaksoft.airbnbexample.models.Announcement;
import peaksoft.airbnbexample.models.Booking;
import peaksoft.airbnbexample.models.Region;
import peaksoft.airbnbexample.models.auth.User;
import peaksoft.airbnbexample.models.enums.Status;
import peaksoft.airbnbexample.repositories.AnnouncementRepository;
import peaksoft.airbnbexample.repositories.RegionRepository;
import peaksoft.airbnbexample.repositories.UserRepository;
import peaksoft.airbnbexample.services.AnnouncementService;


import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {
    private final AnnouncementRepository repository;
    private final AnnouncementEditMapper editMapper;
    private final AnnouncementViewMapper viewMapper;
    private final RegionRepository regionRepository;
    private final UserRepository userRepository;

    public AnnouncementServiceImpl(AnnouncementRepository repository, AnnouncementEditMapper editMapper, AnnouncementViewMapper viewMapper, RegionRepository regionRepository, UserRepository userRepository) {
        this.repository = repository;
        this.editMapper = editMapper;
        this.viewMapper = viewMapper;
        this.regionRepository = regionRepository;
        this.userRepository = userRepository;
    }

    @Override
    public SimpleResponse announcementSave(AnnouncementRequest request) {
        Announcement  newAnnouncement = editMapper.saveAnnouncement(request);
        checkAdField(request, newAnnouncement);
        repository.save(newAnnouncement);
        return new SimpleResponse("SAVE", "Ad saved successfully !");
    }

    @Override
    public AnnouncementInnerPageResponse announcementFindById(Long announcementId) {
        Announcement announcement = getAnnouncementById(announcementId);
        return viewMapper.viewAnnouncementInnerPageResponse(announcement);

    }

    @Override
    @Transactional
    public SimpleResponse announcementUpdate(Long announcementId, AnnouncementRequest request) {

        Announcement newAnnouncement = getAnnouncementById(announcementId);
        if (!Objects.equals(newAnnouncement.getOwner().getId(), request.getOwnerId())){
            throw new ForbiddenException("You can only edit your ads !");
        }
        editMapper.updateAnnouncement(newAnnouncement,request);

        checkAdField(request, newAnnouncement);

        return new SimpleResponse(
                "UPDATE",
                "Ad successfully updated."
        );
    }

    private void checkAdField(AnnouncementRequest request, Announcement announcement) {
        if (request.getOwnerId() <= 0) {
            throw new BadRequestException("Id cannot be negative and null!");
        }
        User owner = userRepository.findById(request.getOwnerId())
                .orElseThrow(() -> new NotFoundException("Owner whit id = " + request.getOwnerId() + " not found!"));
        announcement.setOwner(owner);
        owner.setAnnouncements(List.of(announcement));
        if (request.getImages().size() <= 4) {
            announcement.setImages(request.getImages());
        } else {
            throw new BadRequestException(" You can upload up to 4 photos !");
        }

        if (request.getMaxGuests() <= 0) {
            throw new BadRequestException("The number of guests cannot be negative and equal to zero!");
        }

        BigDecimal bd = request.getPrice();
        double d = bd.doubleValue();
        if (d <= 0) {
            throw new BadRequestException("The ad price cannot be negative or zero!");
        }
        Address address = new Address();
        address.setAddress(request.getAddress());
        address.setTownProvince(request.getTownProvince());
        Region region = regionRepository.findById(request.getRegionId())
                .orElseThrow(() -> new NotFoundException("Region whit id = " + request.getRegionId() + " not found!"));
        address.setRegion(region);
        address.setAnnouncement(announcement);
        announcement.setLocation(address);
        announcement.setStatus(Status.NEW);
    }

    @Override
    @Transactional
    public SimpleResponse announcementDelete(@Param("announcementId") Long announcementId) {
//        Announcement announcement = getAnnouncementById(announcementId);
////       List<Booking> exist = announcement.getBookings();
////       if (exist == null){
////           throw new ForbiddenException("You cannot delete the listing because the listing has a booking!");
////        } else {
////            repository.delete(announcement);
////        }
////        repository.deleteById(announcementId);

//        boolean exists = repository.existsById(announcementId);
//        if (!exists) {
//            throw new NotFoundException(
//                    "Book with id =" + announcementId + " not found!"
//            );
//        }
//        repository.deleteAnnouncementById(announcementId);
        Announcement ann = repository.findById(announcementId).get();
        ann.setDeleted(true);

//        for(Card card : ann.getCards()) {
//            card.setDeleted(true);
//        }

        repository.save(ann);

        return new SimpleResponse(
                "DELETE",
                "Ad successfully removed!"
        );
    }

    private Announcement getAnnouncementById(Long announcementId) {
        return repository.findById(announcementId)
                .orElseThrow(() -> new NotFoundException(
                        "Announcement with id " + announcementId + " not found!"
                ));
    }

}
