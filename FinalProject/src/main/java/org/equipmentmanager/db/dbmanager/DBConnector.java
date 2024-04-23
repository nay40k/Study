package org.equipmentmanager.db.dbmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//
//public class DBConnector {
//
//    private static final String URL = "jdbc:sqlite:test.db";
//
//    public static Connection getConnection() {
//        Connection conn = null;
//        try {
//            // Попытка установить соединение с базой данных
//            conn = DriverManager.getConnection(URL);
//            System.out.println("Соединение с базой данных успешно установлено.");
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return conn;
//    }
//
//}


public class DBConnector {
    private static final String URL = "jdbc:sqlite:test.db";
    private static DBConnector INSTANCE;
    private Connection conn;

    // Приватный конструктор
    private DBConnector() {
        try {
            // Попытка установить соединение с базой данных
            conn = DriverManager.getConnection(URL);
            System.out.println("Соединение с базой данных успешно установлено.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Публичный метод для получения экземпляра
    public static DBConnector getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DBConnector();
        }
        return INSTANCE;
    }

    // Метод для получения соединения
    public Connection getConnection() {
        return conn;
    }
}

