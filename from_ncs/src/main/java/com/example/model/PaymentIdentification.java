package com.example.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class PaymentIdentification {
    @JacksonXmlProperty(localName = "InstrId")
    private String instructionId;

    @JacksonXmlProperty(localName = "EndToEndId")
    private String endToEndId;

    // Getters and setters
    public String getInstructionId() {
        return instructionId;
    }

    public void setInstructionId(String instructionId) {
        this.instructionId = instructionId;
    }

    public String getEndToEndId() {
        return endToEndId;
    }

    public void setEndToEndId(String endToEndId) {
        this.endToEndId = endToEndId;
    }
}