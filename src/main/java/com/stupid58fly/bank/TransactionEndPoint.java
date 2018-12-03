package com.stupid58fly.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import transactionpayment.TransactionRequest;
import transactionpayment.TransactionResponse;

@Endpoint
public class TransactionEndPoint {
    private static final String NAMESPACE_URI = "urn:TransactionPayment";

    @Autowired
    private TransactionProcessor transactionProcessor;


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "transactionRequest")
    @ResponsePayload
    public TransactionResponse validatePayment(@RequestPayload TransactionRequest request) {
        TransactionResponse response = new TransactionResponse();
        // todo use transactionProcessor
        response.setStatus("todo");
        response.setStatusId(-1);

        return response;
    }
}
