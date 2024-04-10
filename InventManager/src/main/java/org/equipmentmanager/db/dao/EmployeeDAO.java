package org.equipmentmanager.db.dao;

import org.equipmentmanager.db.dbmanager.DBConnector;
import org.equipmentmanager.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAO implements DAO {

    @Override
    public void add(Object o) {

    }

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
            System.out.println(e.getMessage());
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
