package com.example.test.booking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelCriteriaBookingInput {
    private String accessCode;
    private String language;
    private String typeSearch;
    private HotelCriteriaBookingRequestReferences references;
}