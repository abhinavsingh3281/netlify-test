package com.example.test.search;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Price {
    private String currency;
    private boolean binding;
    private double net;
    private double gross;
    private Exchange exchange;
    private List<Markup> markups;
}
