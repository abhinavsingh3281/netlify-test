package com.example.test.booking;

import java.util.List;

public class BookingListAuditDataDTO {
    private List<BookingListTransactionDTO> transactions;
    private String timeStamp;

    public List<BookingListTransactionDTO> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<BookingListTransactionDTO> transactions) {
        this.transactions = transactions;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
