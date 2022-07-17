package peaksoft.airbnbexample.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Altynbek Mamasadykov
 */
@Getter @Setter
public class PopularAnnouncementResponse {

    private String title;
    private List<String> images;
    private BigDecimal price;
    private Double rating;
    private String location;

}
