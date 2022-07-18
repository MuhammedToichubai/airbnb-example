package peaksoft.airbnbexample.dto.response;

import lombok.Getter;
import lombok.Setter;
import peaksoft.airbnbexample.models.enums.Status;


import java.math.BigDecimal;

import java.util.List;

@Getter
@Setter
public class SimpleAnnouncementResponse {

    private Long announcementId;
    private String title;
    private List<String> images;
    private BigDecimal price;
    private Integer maxGuests;
    private Double rating;
    private String location;
    private Status status;

}
