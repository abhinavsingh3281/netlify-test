package com.example.test.search;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Markup {
    private String channel;
    private String currency;
    private boolean binding;
    private double net;
    private double gross;
    private Exchange exchange;
}
