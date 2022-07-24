package peaksoft.airbnbexample.dto.req;

import lombok.Getter;
import lombok.Setter;
import peaksoft.airbnbexample.models.enums.Status;

@Getter @Setter
public class AcceptRequest {
    private Long announcementId;
    private Status status;
}
