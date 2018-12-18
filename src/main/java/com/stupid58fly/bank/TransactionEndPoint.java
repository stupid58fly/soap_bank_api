package com.stupid58fly.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import transactionpayment.TransactionRequest;
import transactionpayment.TransactionResponse;

import java.util.Date;
import java.util.Random;

@Endpoint
public class TransactionEndPoint {
    private static final String NAMESPACE_URI = "urn:TransactionPayment";

    @Autowired
    private TransactionProcessor transactionProcessor;


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "transactionRequest")
    @ResponsePayload
    public TransactionResponse validatePayment(@RequestPayload TransactionRequest request) {
        TransactionResponse response = new TransactionResponse();
        if (!validateCardNumber(request.getCardNumber())) {
            response.setStatus(TransactionStatus.InvalidCardNumber.toString());
            response.setStatusId(TransactionStatus.InvalidCardNumber.hashCode());
            return response;
        }

        if (!validateCardValidity(request.getCardValidity())) {
            response.setStatus(TransactionStatus.InvalidCardValidity.toString());
            response.setStatusId(TransactionStatus.InvalidCardValidity.hashCode());
            return response;
        }

        if (!validateCardData(request.getCardNumber(), request.getCardOwner(), request.getCvvCode())) {
            response.setStatus(TransactionStatus.InvalidCardData.toString());
            response.setStatusId(TransactionStatus.InvalidCardData.hashCode());
            return response;
        }

        if (!processTransaction(request.getCardNumber(), request.getTransactionAmount())) {
            response.setStatus(TransactionStatus.InsufficientFunds.toString());
            response.setStatusId(TransactionStatus.InsufficientFunds.hashCode());
            return response;
        }

        response.setStatus(TransactionStatus.Success.toString());
        response.setStatusId(TransactionStatus.Success.hashCode());

        return response;
    }

    private boolean validateCardNumber(String cardNumber) {
        if (!cardNumber.matches("\\d{4} \\d{4} \\d{4} \\d{4}")) {
            return false;
        }

        int sum = 0;
        boolean odd = true;
        for (char c : cardNumber.toCharArray()) {
            if (c == ' ')
                continue;

            int value = c - '0';
            if (odd) {
                value = 2 * value;
                if (value > 9)
                    value -= 9;
            }
            sum += value;
            odd = !odd;
        }

        return sum % 10 == 0;
    }

    private boolean validateCardValidity(String date) {
        String[] splitDate = date.split("/");
        if (splitDate.length != 2) {
            return false;
        }

        try {
            Integer month = Integer.valueOf(splitDate[0]);
            Integer year = Integer.valueOf(splitDate[1]);

            Date currentDate = new Date();

            if (currentDate.getYear() > year + 100) {
                return false;
            }

        } catch (NumberFormatException ignore) {
            return false;
        }

        return true;
    }

    private boolean validateCardData(String number, String owner, Short cvv) {
        return Math.abs(new Random().nextGaussian()) > 0.3d;
    }

    private boolean processTransaction(String number, double transactionAmount) {
        return Math.abs(new Random().nextGaussian()) > 0.2d;
    }
}
