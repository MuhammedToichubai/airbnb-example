package peaksoft.airbnbexample.dto.req;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BlockRequest {
    private List<Long> announcementId;

}
