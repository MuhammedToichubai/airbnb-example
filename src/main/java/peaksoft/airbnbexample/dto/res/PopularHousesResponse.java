package peaksoft.airbnbexample.dto.res;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Altynbek Mamasadykov
 */
@Getter @Setter
public class PopularHousesResponse {

    private String title;
    private List<String> images;
    private BigDecimal price;
    private Double rating;
    private String location;

}
