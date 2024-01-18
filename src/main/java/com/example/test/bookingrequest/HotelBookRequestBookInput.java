package com.example.test.bookingrequest;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelBookRequestBookInput {
  private String optionRefId;
  private String clientReference;
  private String remarks;
  private HotelBookDeltaPrice deltaPrice;
  private HotelBookHolderDetail holder;
  private List<HotelBookOccupancy> rooms;
}