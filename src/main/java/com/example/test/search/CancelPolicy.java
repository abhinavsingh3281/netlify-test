package com.example.test.search;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CancelPolicy {
    private boolean refundable;
    private List<CancelPenalty> cancelPenalties;
}
