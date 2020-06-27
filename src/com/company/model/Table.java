package com.company.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {

    String name;
    String primaryKey;
    List<Column> indexes;
    Map<String, Column> columns = new HashMap<>();
    List<List<Cell>> rows = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public void setIndexes(List<Column> indexes) {
        this.indexes = indexes;
    }

    public void setRows(List<List<Cell>> rows) {
        this.rows = rows;
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public List<Column> getIndexes() {
        return indexes;
    }

    public Map<String, Column> getColumns() {
        return columns;
    }

    public List<List<Cell>> getRows() {
        return rows;
    }

    public Table(String name, String primaryKey, List<Column> columnList){

        this.name = name;
        this.primaryKey = primaryKey;
        for(Column c : columnList){
            columns.put(c.getName(),c);
        }

    }

}
