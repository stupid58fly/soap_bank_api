package com.stupid58fly.bank;

import org.springframework.stereotype.Component;
import transactionpayment.TransactionRequest;

@Component
public class TransactionProcessor {
    public int processTransaction(TransactionRequest transaction) {
        return -1;
    }
}
