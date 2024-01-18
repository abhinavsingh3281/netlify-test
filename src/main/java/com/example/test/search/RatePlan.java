package com.example.test.search;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RatePlan{
    private String code;
    private String name;
    private String effectiveDate;
    private String expireDate;
}
