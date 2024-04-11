package org.equipmentmanager.db.dao;

import org.equipmentmanager.db.dbmanager.DBConnector;
import org.equipmentmanager.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class EmployeeDAO<T> implements DAO {




    @Override
    public void add(Employee employee) {


        String sql = "INSERT INTO employees(name, salary) VALUES(?, ?)";
        try (Connection conn = DBConnector.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, employee.getName());
            pstmt.setDouble(2, employee.getSalary());
            pstmt.executeUpdate();
            System.out.println("Сотрудник успешно добавлен.");
        } catch (SQLException e) {
            System.out.print("Ошибка при добавлении: " + e.getMessage());
        }
    }

    @Override
    public void add(Object entity) {

    }

    @Override
    public void add() {

        Scanner scanner = new Scanner(System.in);

        String sql = "INSERT INTO employees(name, salary) VALUES(?, ?)";
        try (Connection conn = DBConnector.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            String a = scanner.next();
            pstmt.setString(1, a);
            String b = String.valueOf(scanner.nextDouble());
            pstmt.setDouble(2, Double.parseDouble(b));
            pstmt.executeUpdate();
            System.out.println("Сотрудник успешно добавлен.");
        } catch (SQLException e) {
            System.out.print("Ошибка при добавлении: " + e.getMessage());
        }
    }

    @Override
    public Object getById(String id) {
        return null;
    }

    @Override
    public List getAll() {
        return null;
    }

    @Override
    public void update(Object o) {

    }

    @Override
    public void deleteById(String id) {

    }
}
