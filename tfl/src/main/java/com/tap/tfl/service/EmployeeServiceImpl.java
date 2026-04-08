package com.tap.tfl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tap.tfl.entity.Employee;
import com.tap.tfl.repository.IEmployeeRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeRepo employeeRepo;

    // ✅ CREATE
    @Override
    public int createEmployee(Employee emp) {
        return employeeRepo.createEmployee(emp);
    }

    // ✅ GET ALL
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.getAllEmployees();
    }

    // ✅ GET BY ID
    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepo.getEmployeeById(id);
    }

    // ✅ UPDATE
    @Override
    public int updateEmployee(Long id, Employee emp) {
        return employeeRepo.updateEmployee(id, emp);
    }

    // ✅ DELETE
    @Override
    public int deleteEmployee(Long id) {
        return employeeRepo.deleteEmployee(id);
    }
}