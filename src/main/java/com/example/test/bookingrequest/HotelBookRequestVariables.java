package com.example.test.bookingrequest;

import com.example.test.booking.HotelSettingsInput;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelBookRequestVariables {
  private HotelBookRequestBookInput bookInput;
  private HotelSettingsInput settings;
}