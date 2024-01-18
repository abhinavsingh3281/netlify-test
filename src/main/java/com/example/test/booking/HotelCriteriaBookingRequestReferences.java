package com.example.test.booking;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelCriteriaBookingRequestReferences {

  private String hotelCode;
  private String currency;
  private ArrayList<HotelCriteriaBookingRequestReference>references;

}
