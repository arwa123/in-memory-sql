package com.company.dao;

import com.company.model.Database;
import com.company.model.Table;

import java.util.Map;

public class TableOperation {


    public static void createTable(Map<String, Database> databaseMap, String db, Table table) throws  Exception{

        if(table == null)
            throw  new Exception("table can't be null");

        if(!databaseMap.containsKey(db)){
            throw  new Exception("db doesn't exists.");
        }

        Database database = databaseMap.get(db);
        database.getTables().put(table.getName(), table);

        System.out.println("Table created successfully.");

    }


    public static void deleteTable(Map<String, Database> databaseMap, String db, Table table){

        Database database = databaseMap.get(db);

        if(database.getTables().containsKey(table.getName())){
            database.getTables().remove(table.getName());
        }

        System.out.println("Table deleted successfully.");


    }
}
