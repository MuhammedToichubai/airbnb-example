package peaksoft.airbnbexample.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BlockRequest {
    private List<Long> announcementId;

}
