package peaksoft.airbnbexample.dto.res;

import lombok.Getter;
import lombok.Setter;
import peaksoft.airbnbexample.models.enums.Status;

@Getter @Setter
public class AcceptResponse {
    private Status status;
    private String message;
}
