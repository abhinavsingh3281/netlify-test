package com.example.test.search;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomSurcharges {
    private String code;
    private String chargeType;
    private String description;
    //this has to be changed.
    private PriceCurrency price;
}
