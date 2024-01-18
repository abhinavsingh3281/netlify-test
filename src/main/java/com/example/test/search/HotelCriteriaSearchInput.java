package com.example.test.search;

import com.example.test.booking.Occupancy;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelCriteriaSearchInput {
    private String checkIn;
    private String checkOut;
    private List<String> hotels;
    private List<Occupancy> occupancies;
    private String language;
    private String nationality;
    private String currency;
    private String market;
}
