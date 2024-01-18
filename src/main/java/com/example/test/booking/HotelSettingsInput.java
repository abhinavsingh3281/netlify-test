package com.example.test.booking;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelSettingsInput {
    private Suppliers suppliers;
    private Object businessRules;
    private int timeout;
    private String context;
    private String client;
    private boolean auditTransactions;
    private boolean testMode;
//    private Plugins plugins;
}