package com.example.test.booking;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Booking {
  private Reference reference;
  private Holder holder;
  private Hotel hotel;
  private Price price;
  private CancelPolicy cancelPolicy;
  private String remarks;
  private String status;
  private Object payable;

}
