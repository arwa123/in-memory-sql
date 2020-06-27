package com.company;

import com.company.dao.DataOperation;
import com.company.dao.DbOperation;
import com.company.dao.TableOperation;
import com.company.enums.Constraint;
import com.company.enums.DataType;
import com.company.model.Cell;
import com.company.model.Column;
import com.company.model.Database;
import com.company.model.Table;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter DB name");
        String dbName = sc.nextLine();
        Map<String, Database> databaseMap = DbOperation.createDatabase(new Database(dbName, ""));
        System.out.println("Enter Table name");
        String tableName = sc.nextLine();
        System.out.println("Enter no. of columns");
        int columns = sc.nextInt();
        List<Column> columnList = new ArrayList<>();
        IntStream.range(0, columns).forEach(i -> {
            System.out.println("Enter column name");
            String colName = sc.next();
            System.out.println("Enter column type. 1 for Integer 2 for String");
            int colType = sc.nextInt();
            switch (colType) {
                case 1:
                    columnList.add(new Column(colName, DataType.INT, new ArrayList<>(Arrays.asList(Constraint.NOT_NULL, Constraint.MAX_RANGE))));
                    break;
                case 2:
                    columnList.add(new Column(colName, DataType.STRING, new ArrayList<>(Arrays.asList(Constraint.NOT_NULL, Constraint.MAX_LENGTH))));
            }

        });

        Table table = new Table(tableName, "", columnList);
        TableOperation.createTable(databaseMap, dbName, table);
        addData(table);

    }

    private static void addData(Table table) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows ");
        int rows = sc.nextInt();

        IntStream.range(0, rows).forEach(i -> {

            List<Cell> row = new ArrayList<>();
            table.getColumns().forEach((key, value) -> {
                System.out.println("Enter  " + key);
                String data = sc.next();
                Cell cell = null;
                try {
                    cell = new Cell(value, data);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                row.add(cell);
            });
            DataOperation.insert(table, row);
        });


    }
}
