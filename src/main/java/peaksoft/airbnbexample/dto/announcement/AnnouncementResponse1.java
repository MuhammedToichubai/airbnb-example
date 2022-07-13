package peaksoft.airbnbexample.dto.announcement;

import lombok.Getter;
import lombok.Setter;
import peaksoft.airbnbexample.models.enums.Status;
import peaksoft.airbnbexample.models.enums.Type;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Muhammed Toichubai
 */
@Getter
@Setter
public class AnnouncementResponse1 {
    private Long id;
    private String title;
    private String description;
    private List<String> images;
    private Status status;
    private BigDecimal price;
    private Integer maxGuests;
    private Type houseType;
    private LocalDate createdAt;

}
