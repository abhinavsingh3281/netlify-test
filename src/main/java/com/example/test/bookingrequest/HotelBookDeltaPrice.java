package com.example.test.bookingrequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelBookDeltaPrice {
  private Double percent;

  private Double amount;

  private Boolean applyBoth;

}
