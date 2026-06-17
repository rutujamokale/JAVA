package com.transflower.InsuranceRestApi;

import java.time.LocalDateTime;

public class Agent {

private int agentId;
private String agentCode;
private String fullName;
private String email;
private String mobileNumber;
private String licenseNumber;
private String branch;
private String designation;
private double commissionRate;
private double totalCommissionEarned;
private LocalDateTime dateOfJoining;
private boolean isActive;


public int getAgentId() {
    return agentId;
}

public void setAgentId(int agentId) {
    this.agentId = agentId;
}

public String getAgentCode() {
    return agentCode;
}

public void setAgentCode(String agentCode) {
    this.agentCode = agentCode;
}

public String getFullName() {
    return fullName;
}

public void setFullName(String fullName) {
    this.fullName = fullName;
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

public String getLicenseNumber() {
    return licenseNumber;
}

public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
}

public String getBranch() {
    return branch;
}

public void setBranch(String branch) {
    this.branch = branch;
}

public String getDesignation() {
    return designation;
}

public void setDesignation(String designation) {
    this.designation = designation;
}

public double getCommissionRate() {
    return commissionRate;
}

public void setCommissionRate(double commissionRate) {
    this.commissionRate = commissionRate;
}

public double getTotalCommissionEarned() {
    return totalCommissionEarned;
}

public void setTotalCommissionEarned(double totalCommissionEarned) {
    this.totalCommissionEarned = totalCommissionEarned;
}

public LocalDateTime getDateOfJoining() {
    return dateOfJoining;
}

public void setDateOfJoining(LocalDateTime dateOfJoining) {
    this.dateOfJoining = dateOfJoining;
}

public boolean isActive() {
    return isActive;
}

public void setActive(boolean active) {
    isActive = active;
}

}



