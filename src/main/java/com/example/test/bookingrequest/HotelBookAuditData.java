package com.example.test.bookingrequest;

import com.example.test.bookingrequest.response.BookTransactionDto;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelBookAuditData {

  private List<BookTransactionDto> transactions;
  private String timeStamp;

}
