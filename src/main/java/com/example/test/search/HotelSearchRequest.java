package com.example.test.search;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelSearchRequest {
    private String query;
    private HotelSearchRequestVariable variables;
}
