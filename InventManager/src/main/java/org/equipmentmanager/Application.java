package org.equipmentmanager;

import org.equipmentmanager.core.Program;
import org.equipmentmanager.db.dao.DAO;
import org.equipmentmanager.db.dao.EmployeeDAO;
import org.equipmentmanager.db.dbmanager.DBConnector;
import org.equipmentmanager.model.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Application {
    public static void main(String[] args) {
        new Program().start();


//        Employee newEmployee = new Employee();
//        newEmployee.setName("Игорь Мяснов");
//        newEmployee.setSalary(15000.0);
//        DAO<Employee> employeeDAO = new EmployeeDAO<>();

        // Создаем экземпляр DAO для работы с базой данных
//        EmployeeDAO employeeDAO = new EmployeeDAO();

        // Добавляем сотрудника в базу данных
//        employeeDAO.add(newEmployee);
//        employeeDAO.add();

    }
}