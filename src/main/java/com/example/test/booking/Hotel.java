package com.example.test.booking;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotel {
  private String creationDate;
  private String checkIn;
  private String checkOut;
  private String hotelCode;
  private String hotelName;
  private Object boardCode;
  private List<Occupancy> occupancies;
  private List<Room> rooms;

}
