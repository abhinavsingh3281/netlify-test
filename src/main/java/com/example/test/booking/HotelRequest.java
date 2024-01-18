package com.example.test.booking;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelRequest {
    @JsonProperty("query")
    private String query;

    @JsonProperty("variables")
    private HotelRequestVariables variables;
}