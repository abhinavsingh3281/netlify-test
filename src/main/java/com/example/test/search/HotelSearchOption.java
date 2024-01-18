package com.example.test.search;

import com.example.test.booking.Occupancy;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelSearchOption {
    private List<Surcharges> surcharges;
    private String accessCode;
    private String supplierCode;
    private List<String> markets;
    private String hotelCode;
    private String hotelName;
    private String boardCode;
    private String paymentType;
    private String status;
    private List<Occupancy> occupancies;
    private List<Room> rooms;
    private Price price;
    private List<Supplements> supplements;
    private List<String> rateRules;
    private CancelPolicy cancelPolicy;
    private String remarks;
    private String token;
    private String id;
}
