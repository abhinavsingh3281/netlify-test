package com.example.test.search;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomPrice {
    private List<Breakdown> breakdown;
    private Price price;
}
