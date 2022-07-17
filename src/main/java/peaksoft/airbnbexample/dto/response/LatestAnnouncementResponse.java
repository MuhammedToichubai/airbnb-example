package peaksoft.airbnbexample.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class LatestAnnouncementResponse {

    private String title;
    private List<String> images;
    private String description;
    private String location;
}
