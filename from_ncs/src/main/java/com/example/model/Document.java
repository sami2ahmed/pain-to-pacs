package com.example.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Document {
    @JacksonXmlProperty(localName = "CstmrCdtTrfInitn")
    private CustomerCreditTransferInitiation customerCreditTransferInitiation;

    // Getters and setters
    public CustomerCreditTransferInitiation getCustomerCreditTransferInitiation() {
        return customerCreditTransferInitiation;
    }

    public void setCustomerCreditTransferInitiation(CustomerCreditTransferInitiation customerCreditTransferInitiation) {
        this.customerCreditTransferInitiation = customerCreditTransferInitiation;
    }
}
