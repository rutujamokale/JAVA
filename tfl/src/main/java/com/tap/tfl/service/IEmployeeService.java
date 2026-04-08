package com.tap.tfl.service;

import java.util.List;

import com.tap.tfl.entity.Employee;

public interface IEmployeeService {

    int createEmployee(Employee emp);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    int updateEmployee(Long id, Employee emp);

    int deleteEmployee(Long id);
}
