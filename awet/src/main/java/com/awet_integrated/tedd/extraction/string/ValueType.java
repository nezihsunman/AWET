package com.awet_integrated.tedd.extraction.string;

public enum ValueType {

    ASSERT ("assert"),
    LOCATOR ("locator"),
    DRIVER ("driver"),
    CONSTANT ("constant");

    private String type;

    ValueType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}
