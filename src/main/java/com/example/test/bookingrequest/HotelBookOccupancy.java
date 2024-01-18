package com.example.test.bookingrequest;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelBookOccupancy {
    private int occupancyRefId;
    private List<HotelBookPax> paxes;
}
