package peaksoft.airbnbexample.dto.response;

import lombok.Getter;
import lombok.Setter;
import peaksoft.airbnbexample.models.enums.Status;
import peaksoft.airbnbexample.models.enums.Type;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Altynbek Mamasadykov
 */
@Getter
@Setter
public class AnnouncementInnerPageResponse {

    private Long id;
    private List<String> images;
    private Type houseType;
    private Integer maxGuests;
    private String title;
    private String location;
    private String description;
    private String ownerImage;
    private String ownerFullName;
    private String ownerEmail;

}
