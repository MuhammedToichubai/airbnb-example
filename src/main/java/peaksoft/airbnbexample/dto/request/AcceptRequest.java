package peaksoft.airbnbexample.dto.request;

import lombok.Getter;
import lombok.Setter;
import peaksoft.airbnbexample.models.enums.Status;

@Getter @Setter
public class AcceptRequest {
    private Long announcementId;
    private Status status;
}
