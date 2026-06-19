package com.transflower.InsuranceRestApi.Department;
import com.trasflower.InsuranceRestApi.models;

public class CustomerServiceDepartment{
      public void onCustomerRegistered(Customer customer) {
        System.out.println("====================================");
        System.out.println("Customer Service Department");
        System.out.println("Customer '" + customer.getFullName() + " "
                + customer.getLastName() + "' registered successfully.");
        System.out.println("Welcome email and onboarding process initiated.");
        System.out.println("====================================");
    }

    public void onCustomerUpdated(Customer customer) {
        System.out.println("====================================");
        System.out.println("Customer profile updated.");
        System.out.println("Customer: " + customer.getFullName() + " "
                + customer.getLastName());
        System.out.println("====================================");
    }

    public void onCustomerDeactivated(int customerId) {
        System.out.println("====================================");
        System.out.println("Customer with Id " + customerId + " has been deactivated.");
        System.out.println("====================================");
    }

    public void onPolicyDocumentSent(String policyNumber) {
        System.out.println("====================================");
        System.out.println("Policy document sent for Policy No: " + policyNumber);
        System.out.println("====================================");
    }

    public void onRenewalReminderSent(String policyNumber) {
        System.out.println("====================================");
        System.out.println("Renewal reminder sent for Policy No: " + policyNumber);
        System.out.println("====================================");
    }

    public void onKycVerified(Customer customer) {
        System.out.println("====================================");
        System.out.println("KYC verification completed for "
                + customer.getFullName() + " "
                + customer.getLastName());
        System.out.println("====================================");
    }

    public void onCustomerQueryRaised(String query) {
        System.out.println("====================================");
        System.out.println("Customer Query");
        System.out.println(query);
        System.out.println("Support ticket created successfully.");
        System.out.println("====================================");
    }

    public void onFeedbackReceived(String feedback) {
        System.out.println("====================================");
        System.out.println("Customer Feedback Received");
        System.out.println(feedback);
        System.out.println("====================================");
    }
}