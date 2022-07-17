package peaksoft.airbnbexample.dto.request;

import lombok.Getter;
import lombok.Setter;
import peaksoft.airbnbexample.models.enums.Status;

import java.util.List;

@Getter @Setter
public class BlockRequest {
    private List<Long> announcementId;
    private Status status;

}
