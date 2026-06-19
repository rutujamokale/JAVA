package com.transflower.InsuranceRestApi.Department;
import com.transflower.InsuranceRestApi.models.Agent;
import com.transflower.InsuranceRestApi.models.Claim;
import com.transflower.InsuranceRestApi.models.Policy;
import com.transflower.InsuranceRestApi.models.Premium;

public class AccountDepartment{

      public void onPolicyPurchased(Policy policy) {
        System.out.println("====================================");
        System.out.println("Accounts Department");
        System.out.println("New policy purchased: " + policy.getPolicyNumber());
        System.out.println("Financial records updated.");
        System.out.println("====================================");
    }

    public void onPremiumPaid(Premium premium) {
        System.out.println("====================================");
        System.out.println("Premium Payment Received");
        System.out.println("Policy Id      : " + premium.getPolicyId());
        System.out.println("Amount Paid    : " + premium.getAmountPaid());
        System.out.println("Payment Mode   : " + premium.getPaymentMode());
        System.out.println("Payment recorded successfully.");
        System.out.println("====================================");
    }

    public void onPremiumRefunded(Premium premium) {
        System.out.println("====================================");
        System.out.println("Premium Refund");
        System.out.println("Policy Id      : " + premium.getPolicyId());
        System.out.println("Refund Amount  : " + premium.getAmountPaid());
        System.out.println("Refund processed successfully.");
        System.out.println("====================================");
    }

    public void onClaimApproved(Claim claim) {
        System.out.println("====================================");
        System.out.println("Claim Approved");
        System.out.println("Claim Id       : " + claim.getClaimId());
        System.out.println("Awaiting settlement.");
        System.out.println("====================================");
    }

    public void onClaimSettled(Claim claim) {
        System.out.println("====================================");
        System.out.println("Claim Settlement");
        System.out.println("Claim Id         : " + claim.getClaimId());
        System.out.println("Approved Amount  : " + claim.getApprovedAmount());
        System.out.println("Settlement payment released.");
        System.out.println("====================================");
    }

    public void onAgentCommissionCalculated(Agent agent) {
        System.out.println("====================================");
        System.out.println("Agent Commission");
        System.out.println("Agent            : " + agent.getFullName());
        System.out.println("Commission Rate  : " + (agent.getCommissionRate() * 100) + "%");
        System.out.println("Total Earned     : " + agent.getTotalCommissionEarned());
        System.out.println("====================================");
    }

    public void onPaymentReceiptGenerated(Premium premium) {
        System.out.println("====================================");
        System.out.println("Payment Receipt");
        System.out.println("Policy Id    : " + premium.getPolicyId());
        System.out.println("Amount       : " + premium.getAmountPaid());
        System.out.println("Receipt generated successfully.");
        System.out.println("====================================");
    }

    public void onLateFeeApplied(String policyNumber) {
        System.out.println("====================================");
        System.out.println("Late payment fee applied to policy " + policyNumber);
        System.out.println("====================================");
    }

    public void onDailyReportGenerated(LocalDate reportDate) {
        System.out.println("====================================");
        System.out.println("Daily financial report generated on " + reportDate);
        System.out.println("====================================");
    }

    public void onMonthlyReportGenerated(LocalDate reportDate) {
        System.out.println("====================================");
        System.out.println("Monthly financial report generated for " +
                reportDate.format(DateTimeFormatter.ofPattern("MMMM yyyy")));
        System.out.println("====================================");
    }
}
