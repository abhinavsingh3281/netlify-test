package com.example.test.booking;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingListHotelBooking {

  private BookingListAuditDataDTO auditData;
  private List<Booking> bookings;
  private List<BookingError> errors;
  private List<BookingError> warnings;
}
