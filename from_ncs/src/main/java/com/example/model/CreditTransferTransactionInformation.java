package com.example.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class CreditTransferTransactionInformation {
    @JacksonXmlProperty(localName = "PmtId")
    private PaymentIdentification paymentIdentification;

    @JacksonXmlProperty(localName = "Amt")
    private Amount amount;

    // Getters and setters
    public PaymentIdentification getPaymentIdentification() {
        return paymentIdentification;
    }

    public void setPaymentIdentification(PaymentIdentification paymentIdentification) {
        this.paymentIdentification = paymentIdentification;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }
}