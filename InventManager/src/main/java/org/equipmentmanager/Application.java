package org.equipmentmanager;

import org.equipmentmanager.core.Program;
import org.equipmentmanager.db.dao.EmployeeDAO;
import org.equipmentmanager.db.dbmanager.DBConnector;
import org.equipmentmanager.model.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Application {
    public static void main(String[] args) {
//        new Program().start();

        Employee newEmployee = new Employee();
        newEmployee.setName("Петя Петров");
        newEmployee.setSalary(45000.0);

        // Создаем экземпляр DAO для работы с базой данных
        EmployeeDAO employeeDAO = new EmployeeDAO();

        // Добавляем сотрудника в базу данных
        employeeDAO.add(newEmployee);

    }
}