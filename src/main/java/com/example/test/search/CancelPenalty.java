package com.example.test.search;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CancelPenalty {
    private int hoursBefore;
    private String deadline;
    private String penaltyType;
    private String currency;
    private double value;
}
