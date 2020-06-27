package com.company.dao;

import com.company.model.Cell;
import com.company.model.Table;

import java.util.List;

public class DataOperation {


    public static void insert(Table table, List<Cell> row){

        table.getRows().add(row);
        System.out.println("data inserted");
    }
}
