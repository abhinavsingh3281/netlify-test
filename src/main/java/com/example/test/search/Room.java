package com.example.test.search;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    private int occupancyRefId;
    private List<Promotion> promotions;
    private String code;
    private String description;
    private boolean refundable;
    private List<RoomSurcharges> surcharges;
    private List<Bed> beds;
    private List<Amenity> amenities;
    private String units;
    private RoomPrice roomPrice;
    private List<RatePlan> ratePlans;
}
