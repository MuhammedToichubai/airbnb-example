package peaksoft.airbnbexample.mapper.booking;

import org.springframework.stereotype.Component;
import peaksoft.airbnbexample.dto.response.BookingResponse;
import peaksoft.airbnbexample.models.Booking;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Component
public class BookingViewMapper {
    public BookingResponse viewBooking(Booking booking) {
        if (booking == null) {
            return null;
        }

        BookingResponse response = new BookingResponse();
        response.setCheckin(booking.getCheckin().format(DateTimeFormatter.ISO_LOCAL_DATE));
        response.setCheckout(booking.getCheckout().format(DateTimeFormatter.ISO_LOCAL_DATE));
        return response;
    }

    public List<BookingResponse> view(List<Booking> bookings) {
        List<BookingResponse> responses = new ArrayList<>();
        for (Booking booking : bookings) {
            responses.add(viewBooking(booking));
        }
        return responses;
    }
}
