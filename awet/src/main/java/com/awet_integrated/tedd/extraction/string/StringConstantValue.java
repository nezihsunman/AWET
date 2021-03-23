package com.awet_integrated.tedd.extraction.string;

import com.awet_integrated.tedd.statement.LiteralParameter;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StringConstantValue implements StringValue {

    private LiteralParameter literalParameter;

    public StringConstantValue(LiteralParameter literalParameter){
        this.literalParameter = literalParameter;
    }

    @Override
    public String toString(){
        return this.literalParameter.getValue();
    }

    @Override
    public boolean equals(Object other){

        if(other == this) return true;

        if(other instanceof StringConstantValue){
            StringConstantValue otherStringConstantValue = (StringConstantValue) other;
            return Objects.equals(this.literalParameter, otherStringConstantValue.literalParameter);
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.literalParameter);
    }

    @Override
    public ValueType getValueType() {
        return ValueType.CONSTANT;
    }

    @Override
    public List<String> getValues() {
        return Arrays.asList(this.literalParameter.getValue());
    }
}
