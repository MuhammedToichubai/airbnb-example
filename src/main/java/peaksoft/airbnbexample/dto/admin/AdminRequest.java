package peaksoft.airbnbexample.dto.admin;

import lombok.Getter;
import lombok.Setter;
import peaksoft.airbnbexample.models.enums.Status;

@Getter
@Setter
public class AdminRequest {
    private Status status;
    private String message;
}
