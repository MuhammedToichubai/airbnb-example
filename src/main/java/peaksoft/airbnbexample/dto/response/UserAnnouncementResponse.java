package peaksoft.airbnbexample.dto.response;

import lombok.Getter;
import lombok.Setter;
import peaksoft.airbnbexample.models.enums.Type;

import java.util.List;


@Getter @Setter
public class UserAnnouncementResponse {
    private Long announcementId;
    private List<String> images;
    private Type houseType;
    private Integer maxGuests;
    private String title;
    private String location;
    private String description;

}
