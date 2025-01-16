package com.example.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.List;

public class CustomerCreditTransferInitiation {
    @JacksonXmlProperty(localName = "GrpHdr")
    private GroupHeader groupHeader;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "PmtInf")
    private List<PaymentInformation> paymentInformation;

    // Getters and setters
    public GroupHeader getGroupHeader() {
        return groupHeader;
    }

    public void setGroupHeader(GroupHeader groupHeader) {
        this.groupHeader = groupHeader;
    }

    public List<PaymentInformation> getPaymentInformation() {
        return paymentInformation;
    }

    public void setPaymentInformation(List<PaymentInformation> paymentInformation) {
        this.paymentInformation = paymentInformation;
    }
}