package org.equipmentmanager.db.dbmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector {

    private static final String URL = "jdbc:sqlite:D:/study/InventManager/test.db";

    /**
     * Получение объекта Connection для подключения к базе данных.
     * @return объект Connection для работы с базой данных
     */
    public static Connection connect() {
        Connection conn = null;
        try {
            // Попытка установить соединение с базой данных
            conn = DriverManager.getConnection(URL);
            System.out.println("Соединение с базой данных успешно установлено.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

}
