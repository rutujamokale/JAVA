package com.transflower.InsuranceRestApi;

import java.time.LocalDateTime;

public class Employee {

private int employeeId;
private String employeeCode;
private String firstName;
private String lastName;
private String email;
private String mobileNumber;
private String department;
private String designation;
private LocalDateTime dateOfJoining;
private double salary;
private boolean isActive;
private String address;


// Computed Property Equivalent
public String getFullName() {
    return firstName + " " + lastName;
}

// Getters and Setters

public int getEmployeeId() {
    return employeeId;
}

public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
}

public String getEmployeeCode() {
    return employeeCode;
}

public void setEmployeeCode(String employeeCode) {
    this.employeeCode = employeeCode;
}

public String getFirstName() {
    return firstName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getMobileNumber() {
    return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
}

public String getDepartment() {
    return department;
}

public void setDepartment(String department) {
    this.department = department;
}

public String getDesignation() {
    return designation;
}

public void setDesignation(String designation) {
    this.designation = designation;
}

public LocalDateTime getDateOfJoining() {
    return dateOfJoining;
}

public void setDateOfJoining(LocalDateTime dateOfJoining) {
    this.dateOfJoining = dateOfJoining;
}

public double getSalary() {
    return salary;
}

public void setSalary(double salary) {
    this.salary = salary;
}

public boolean isActive() {
    return isActive;
}

public void setActive(boolean active) {
    isActive = active;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

@Override
public String toString() {
    return employeeCode + " - " +
           getFullName() +
           " (" + department + ")";
}

}
