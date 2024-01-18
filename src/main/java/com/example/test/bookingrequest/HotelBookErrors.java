package com.example.test.bookingrequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelBookErrors {
  private String code;
  private String type;
  private String description;
}
