package peaksoft.airbnbexample.dto.res;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class PopularApartmentResponse {

    private String title;
    private List<String> images;
    private String description;
    private String location;
}
