package com.example.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class GroupHeader {
    @JacksonXmlProperty(localName = "MsgId")
    private String messageId;

    @JacksonXmlProperty(localName = "CreDtTm")
    private String creationDateTime;

    @JacksonXmlProperty(localName = "NbOfTxs")
    private int numberOfTransactions;

    // Getters and setters
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }
}
