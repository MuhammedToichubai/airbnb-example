package peaksoft.airbnbexample.apis;

import org.springframework.web.bind.annotation.*;
import peaksoft.airbnbexample.dto.request.BookingRequest;
import peaksoft.airbnbexample.dto.response.BookingResponse;
import peaksoft.airbnbexample.dto.response.SimpleResponse;

import java.util.List;

@RestController
@RequestMapping("/api/booking")
public class BookingAPI {

    //User
    @PostMapping("/saveBooking")
    public BookingResponse saveBooking(@RequestBody BookingRequest bookingRequest){
        return null;
    }

    //Admin, User
    @GetMapping("/user/getAllBooking/{userId}")
    public List<BookingResponse> userGerAllBooking(@PathVariable Long userId){
        return null;
    }

    //User
    @PostMapping("/updateBooking/{bookingId}")
    public BookingResponse updateBooking(@PathVariable Long bookingId,
                                         @RequestBody BookingRequest bookingRequest){
        return null;
    }

    //User
    @DeleteMapping("/deleteBooking/{bookingId}")
    public SimpleResponse deleteBooking(@PathVariable Long bookingId){
        return null;
    }

}
