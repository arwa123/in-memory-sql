package com.company.model;

import com.company.enums.Constraint;

import java.util.List;

public interface IConstraint {

    public boolean validate(List<Constraint> constraints, Object value);
}
