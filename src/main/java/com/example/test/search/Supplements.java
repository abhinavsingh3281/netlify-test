package com.example.test.search;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplements {
    private String code;
    private String name;
    private String description;
    private String supplementType;
    private String chargeType;
    private boolean mandatory;
    private String durationType;
    private int quantity;
    private String unit;
    private String effectiveDate;
    private String expireDate;
    private Resort resort;
    private Price price;
}
