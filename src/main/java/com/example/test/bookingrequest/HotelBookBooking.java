package com.example.test.bookingrequest;


import com.example.test.booking.Holder;
import com.example.test.booking.Hotel;
import com.example.test.booking.Price;
import com.example.test.booking.Reference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelBookBooking {

  private Price price;
  private String status;
  private String remarks;
  private Reference reference;
  private Holder holder;
  private Hotel hotel;

}
