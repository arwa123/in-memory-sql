package com.company.dao;

import com.company.model.Database;

import java.util.HashMap;
import java.util.Map;

public class DbOperation {


    static Map<String, Database> databaseMap = new HashMap<>();

    public static Map<String, Database> createDatabase(Database db){

        //TODO:

        databaseMap.put(db.getName(),db);
        System.out.println("DB created successfully.");

        return databaseMap;


    }
}
