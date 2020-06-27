package com.company.model;

import com.company.enums.Constraint;

import java.util.List;

public class IntegerConstraint implements IConstraint {
    @Override
    public  boolean validate(List<Constraint> constraints, Object value) {

        try{
            Integer.parseInt(value.toString());
            return true;
        }
        catch(Exception ex) {
            return false;

        }
    }
}
