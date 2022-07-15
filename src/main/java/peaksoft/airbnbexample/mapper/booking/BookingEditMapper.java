package peaksoft.airbnbexample.mapper.booking;

import org.springframework.stereotype.Component;
import peaksoft.airbnbexample.dto.request.BookingRequest;
import peaksoft.airbnbexample.models.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class BookingEditMapper {

    public Booking saveBooking(BookingRequest request){
        if (request == null){
            return null;
        }
        Booking booking = new Booking();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        booking.setCheckin(LocalDate.parse(request.getCheckin(), dateTimeFormatter));
        booking.setCheckout(LocalDate.parse(request.getCheckout(), dateTimeFormatter));
        return booking;
    }

    public void updateBooking(Booking booking, BookingRequest request){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        booking.setCheckin(LocalDate.parse(request.getCheckin(), dateTimeFormatter));
        booking.setCheckout(LocalDate.parse(request.getCheckout(), dateTimeFormatter));
    }
}
