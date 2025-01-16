package com.example.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Debtor {
    @JacksonXmlProperty(localName = "Nm")
    private String name;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}