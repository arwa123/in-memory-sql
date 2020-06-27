package com.company.model;

import com.company.enums.Constraint;
import com.company.enums.DataType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Column {

    String name;
    DataType dataType;
    Map<String, Constraint> constraintMap = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public void setConstraintList(List<Constraint> constraintList) {
    //    this.constraintList = constraintList;
    }

    public DataType getDataType() {
        return dataType;
    }

    public Map<String, Constraint> getConstraintList() {
        return constraintMap;
    }

    public Column(String name, DataType type){
        this.name = name;
        this.dataType = type;
    }

    public Column(String name, DataType type, List<Constraint> constraints){
        this.name = name;
        this.dataType = type;

        for(Constraint c : constraints){
            constraintMap.put(c.name(), c);
        }
    }
}
