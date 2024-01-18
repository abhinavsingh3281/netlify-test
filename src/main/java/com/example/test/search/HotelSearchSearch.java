package com.example.test.search;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelSearchSearch {
    private String context;
    private HotelSearchAuditData auditData;
    private RequestCriteria requestCriteria;
    private List<HotelSearchOption> options;
    private List<Warning> warnings;
    private List<HotelSearchError> errors;
}
