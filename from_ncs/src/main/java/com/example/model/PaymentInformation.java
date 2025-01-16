package com.example.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.List;

public class PaymentInformation {
    @JacksonXmlProperty(localName = "PmtInfId")
    private String paymentInformationId;

    @JacksonXmlProperty(localName = "Dbtr")
    private Debtor debtor;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "CdtTrfTxInf")
    private List<CreditTransferTransactionInformation> creditTransferTransactionInformation;

    // Getters and setters
    public String getPaymentInformationId() {
        return paymentInformationId;
    }

    public void setPaymentInformationId(String paymentInformationId) {
        this.paymentInformationId = paymentInformationId;
    }

    public Debtor getDebtor() {
        return debtor;
    }

    public void setDebtor(Debtor debtor) {
        this.debtor = debtor;
    }

    public List<CreditTransferTransactionInformation> getCreditTransferTransactionInformation() {
        return creditTransferTransactionInformation;
    }

    public void setCreditTransferTransactionInformation(List<CreditTransferTransactionInformation> creditTransferTransactionInformation) {
        this.creditTransferTransactionInformation = creditTransferTransactionInformation;
    }
}