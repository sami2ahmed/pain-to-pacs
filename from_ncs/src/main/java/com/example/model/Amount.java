package com.example.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Amount {
    @JacksonXmlProperty(localName = "InstdAmt")
    private InstructedAmount instructedAmount;

    // Getters and setters
    public InstructedAmount getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(InstructedAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
    }
}