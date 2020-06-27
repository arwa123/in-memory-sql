package com.company.model;

import java.util.HashMap;
import java.util.Map;

public class Database {


    String name;
    String description;
    Map<String, Table> tables = new HashMap<>();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Table> getTables() {
        return tables;
    }



    public Database(String name, String desc){
        this.name = name;
        this.description = desc;
    }

}
