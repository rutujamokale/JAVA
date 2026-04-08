package com.tap.tfl.repository;

import java.util.List;

import com.tap.tfl.entity.Employee;

public interface IEmployeeRepo    {
    int createEmployee(Employee emp);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    int updateEmployee(Long id, Employee emp);

    int deleteEmployee(Long id);
}
