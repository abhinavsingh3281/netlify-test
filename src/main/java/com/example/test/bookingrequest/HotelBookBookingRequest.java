package com.example.test.bookingrequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelBookBookingRequest {
  private String query;
  private HotelBookRequestVariables variables;
}