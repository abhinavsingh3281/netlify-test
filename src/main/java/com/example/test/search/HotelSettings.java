package com.example.test.search;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelSettings {
    private Suppliers suppliers;
    private Object businessRules;
    private int timeout;
    private String context;
    private String client;
    private boolean auditTransactions;
    private boolean testMode;
}
