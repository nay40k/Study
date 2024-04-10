package org.equipmentmanager.db.dao;

import org.equipmentmanager.model.Employee;

import java.util.List;

public interface DAO<T> {

    void add(T t);

    void add(Employee o);

    T getById(String id);

    List<T> getAll();

    void update(T t);

    void deleteById(String id);

}
