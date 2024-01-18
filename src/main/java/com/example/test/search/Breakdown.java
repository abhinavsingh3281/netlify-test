package com.example.test.search;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Breakdown {
    private String start;
    private String end;
    private BreakdownPrice price;
}
