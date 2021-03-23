package com.awet_integrated.tedd.extraction.statement;

public class AssertTrueStatement extends AssertStatement {

    public AssertTrueStatement(DriverStatement driverStatement){
        super(AssertType.TRUE, driverStatement);
    }

    @Override
    public String toString(){
        return "assert" + this.getAssertType().getValue() + "(" + this.getDriverStatement() + ")";
    }
}
