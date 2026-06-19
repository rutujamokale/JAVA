package com.transflower.InsuranceRestApi;

import java.time.LocalDateTime;

public class Premium {

// Unique identifier for the premium payment
private int premiumId;

// Associated policy information
private int policyId;
private String policyNumber;

// Customer information
private int customerId;
private String customerName;

// Payment details
private double amountPaid;
private LocalDateTime paymentDate;

// UPI, Credit Card, Debit Card, Net Banking, Cash, Cheque, etc.
private String paymentMode;

// Transaction or reference number
private String transactionId;

// Monthly, Quarterly, Half-Yearly, Annual
private String paymentFrequency;

// Success, Pending, Failed, Refunded
private String paymentStatus;

// Optional remarks
private String remarks;

public int getPremiumId() {
    return premiumId;
}

public void setPremiumId(int premiumId) {
    this.premiumId = premiumId;
}

public int getPolicyId() {
    return policyId;
}

public void setPolicyId(int policyId) {
    this.policyId = policyId;
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

public double getAmountPaid() {
    return amountPaid;
}

public void setAmountPaid(double amountPaid) {
    this.amountPaid = amountPaid;
}

public LocalDateTime getPaymentDate() {
    return paymentDate;
}

public void setPaymentDate(LocalDateTime paymentDate) {
    this.paymentDate = paymentDate;
}

public String getPaymentMode() {
    return paymentMode;
}

public void setPaymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
}

public String getTransactionId() {
    return transactionId;
}

public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
}

public String getPaymentFrequency() {
    return paymentFrequency;
}

public void setPaymentFrequency(String paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
}

public String getPaymentStatus() {
    return paymentStatus;
}

public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
}

public String getRemarks() {
    return remarks;
}

public void setRemarks(String remarks) {
    this.remarks = remarks;
}

@Override
public String toString() {
    return "Premium{" +
            "premiumId=" + premiumId +
            ", policyNumber='" + policyNumber + '\'' +
            ", customerName='" + customerName + '\'' +
            ", amountPaid=" + amountPaid +
            ", paymentStatus='" + paymentStatus + '\'' +
            '}';
}
}
