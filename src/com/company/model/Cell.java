package com.company.model;

import com.company.enums.Constraint;
import com.company.enums.DataType;

import java.util.List;

public class Cell {

    Column column;
    Object value;

    public Column getColumn() {
        return column;
    }

    public void setColumn(Column column) {
        this.column = column;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }



    public  Cell(Column col, Object value) throws Exception {
        this.column = col;
        this.value  = value;
        isValidData();
    }

    private void isValidData() throws Exception {

        if(this.column.constraintMap != null){

//           List<Constraint> constraints = (List<Constraint>) this.column.constraintMap.values();
            if(this.column.dataType == DataType.INT)
            {
                IntegerConstraint intC = new IntegerConstraint();
                if(!intC.validate(null, this.value))
                    throw new Exception("invalid data");
            }else{

                StringConstraint strC = new StringConstraint();
                strC.validate(null, this.value);
            }


        }
    }
}
