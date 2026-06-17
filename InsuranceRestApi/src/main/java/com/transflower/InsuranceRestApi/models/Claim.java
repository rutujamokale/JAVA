package com.transflower.InsuranceRestApi;
import java.time.LocalDateTime;

public class Claim {

// Unique identifier for the claim
private int claimId;

// Policy against which the claim is raised
private String policyNumber;

// Customer details
private int customerId;
private String customerName;

// Claim information
private LocalDateTime claimDate;
private String claimType;
private String reason;

private double claimAmount;
private double approvedAmount;

// Registered, Under Review, Approved, Rejected, Settled
private String status;

// Optional remarks from claim officer
private String remarks;

// Settlement information
private LocalDateTime settlementDate;
    
public int getClaimId() {
    return claimId;
}

public void setClaimId(int claimId) {
    this.claimId = claimId;
}

public String getPolicyNumber() {
    return policyNumber;
}

public void setPolicyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
}

public int getCustomerId() {
    return customerId;
}

public void setCustomerId(int customerId) {
    this.customerId = customerId;
}

public String getCustomerName() {
    return customerName;
}

public void setCustomerName(String customerName) {
    this.customerName = customerName;
}

public LocalDateTime getClaimDate() {
    return claimDate;
}

public void setClaimDate(LocalDateTime claimDate) {
    this.claimDate = claimDate;
}

public String getClaimType() {
    return claimType;
}

public void setClaimType(String claimType) {
    this.claimType = claimType;
}

public String getReason() {
    return reason;
}

public void setReason(String reason) {
    this.reason = reason;
}

public double getClaimAmount() {
    return claimAmount;
}

public void setClaimAmount(double claimAmount) {
    this.claimAmount = claimAmount;
}

public double getApprovedAmount() {
    return approvedAmount;
}

public void setApprovedAmount(double approvedAmount) {
    this.approvedAmount = approvedAmount;
}

public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}

public String getRemarks() {
    return remarks;
}

public void setRemarks(String remarks) {
    this.remarks = remarks;
}

public LocalDateTime getSettlementDate() {
    return settlementDate;
}

public void setSettlementDate(LocalDateTime settlementDate) {
    this.settlementDate = settlementDate;
}

@Override
public String toString() {
    return "Claim{" +
            "claimId=" + claimId +
            ", policyNumber='" + policyNumber + '\'' +
            ", customerName='" + customerName + '\'' +
            ", claimAmount=" + claimAmount +
            ", status='" + status + '\'' +
            '}';
}


}
