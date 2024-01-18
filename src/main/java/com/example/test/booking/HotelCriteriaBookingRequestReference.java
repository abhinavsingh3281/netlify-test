package com.example.test.booking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelCriteriaBookingRequestReference {
  private String supplier;
  private String client;

}
