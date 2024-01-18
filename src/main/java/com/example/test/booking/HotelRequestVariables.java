package com.example.test.booking;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelRequestVariables {
    @JsonProperty("criteriaBookingRead")
    private HotelCriteriaBookingInput criteriaBookingRead;

    @JsonProperty("settings")
    private HotelSettingsInput settings;
}