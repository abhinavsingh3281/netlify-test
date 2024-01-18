package com.example.test.bookingrequest;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelBookBook {
  private HotelBookAuditData auditData;
  private HotelBookBooking booking;
  private List<HotelBookErrors> errors;
  private Object warnings;
}
