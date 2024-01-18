package com.example.test.search;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Surcharges {
    private String chargeType;
    private boolean mandatory;
    private String description;
    private Price price;
}
