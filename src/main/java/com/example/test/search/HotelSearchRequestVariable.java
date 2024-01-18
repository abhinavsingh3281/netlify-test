package com.example.test.search;

import com.example.test.booking.HotelSettingsInput;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelSearchRequestVariable {
  private HotelCriteriaSearchInput criteriaSearch;
  private HotelXFilterSearchInput filterSearch;
  private HotelSettingsInput settings;
}
