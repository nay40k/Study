package org.equipmentmanager.db.dbmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnector {
    private static final String URL = "jdbc:sqlite:test.db";
    private static DBConnector INSTANCE;
    private Connection conn;

    private DBConnector() {
        connect();
    }

    private void connect() {
        try {
            conn = DriverManager.getConnection(URL);
//            System.out.println("Соединение с базой данных успешно установлено.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static DBConnector getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DBConnector();
        } else {
            try {
                if (INSTANCE.conn == null || INSTANCE.conn.isClosed()) {
                    INSTANCE.connect();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return INSTANCE;
    }

    public Connection getConnection() throws SQLException{
        return conn;
    }
//
//public class DBConnector {
//
//    private static final String URL = "jdbc:sqlite:test.db";
//
//    public static Connection getConnection() {
//        Connection conn = null;
//        try {
//            conn = DriverManager.getConnection(URL);
//            System.out.println("Соединение с базой данных успешно установлено.");
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return conn;
//    }
//
//}


//public class DBConnector {
//    private static final String URL = "jdbc:sqlite:test.db";
//    private static DBConnector INSTANCE;
//    private Connection conn;
//
//    private DBConnector() {
//        try {
//            conn = DriverManager.getConnection(URL);
//            System.out.println("Соединение с базой данных успешно установлено.");
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static DBConnector getInstance() {
//        if (INSTANCE == null) {
//            INSTANCE = new DBConnector();
//        }
//        return INSTANCE;
//    }
//
//    public Connection getConnection() {
//        return conn;
//    }
//}

}
