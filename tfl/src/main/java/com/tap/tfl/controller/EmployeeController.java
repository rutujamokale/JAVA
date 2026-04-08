package com.tap.tfl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tap.tfl.entity.Employee;
import com.tap.tfl.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
// @CrossOrigin("*")   // for React frontend
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    // ✅ CREATE
    @PostMapping
    public String createEmployee(@RequestBody Employee emp) {
        int result = employeeService.createEmployee(emp);
        if (result > 0) {
            return "Employee created successfully";
        }
        return "Failed to create employee";
    }

    // ✅ GET ALL
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // ✅ GET BY ID (VIEW)
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    // ✅ UPDATE (EDIT)
    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable Long id, @RequestBody Employee emp) {
        int result = employeeService.updateEmployee(id, emp);
        if (result > 0) {
            return "Employee updated successfully";
        }
        return "Employee not found or update failed";
    }

    // ✅ DELETE
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        int result = employeeService.deleteEmployee(id);
        if (result > 0) {
            return "Employee deleted successfully";
        }
        return "Employee not found or delete failed";
    }
}