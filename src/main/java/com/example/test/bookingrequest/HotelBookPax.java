package com.example.test.bookingrequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelBookPax {
    private String name;
    private String surname;
    private int age;
}