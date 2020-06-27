package com.company.model;

import com.company.enums.Constraint;

import java.util.List;

public class StringConstraint implements IConstraint {

    @Override
    public  boolean validate(List<Constraint> constraints,  Object value) {
        return false;
    }
}
