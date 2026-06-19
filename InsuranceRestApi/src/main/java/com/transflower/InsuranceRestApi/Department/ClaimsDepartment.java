package com.transflower.InsuranceRestApi.Department;

public class ClaimDepartment{
    public List<Claim> claims=new ArrayList<>();

     public void onClaimRegistered(Claim claim) {
        claims.add(claim);

        System.out.println("====================================");
        System.out.println("Claims Department");
        System.out.println("Claim " + claim.getClaimId() + " registered successfully.");
        System.out.println("Claim forwarded for verification.");
        System.out.println("====================================");
    }

    public void onClaimVerified(Claim claim) {
        System.out.println("====================================");
        System.out.println("Claim " + claim.getClaimId() + " has been verified.");
        System.out.println("Supporting documents validated.");
        System.out.println("====================================");
    }

    public void onClaimApproved(Claim claim) {
        claim.setStatus("APPROVED");

        System.out.println("====================================");
        System.out.println("Claim " + claim.getClaimId() + " approved.");
        System.out.println("Settlement process initiated.");
        System.out.println("====================================");
    }

    public void onClaimRejected(Claim claim) {
        claim.setStatus("REJECTED");

        System.out.println("====================================");
        System.out.println("Claim " + claim.getClaimId() + " rejected.");
        System.out.println("Customer will be notified.");
        System.out.println("====================================");
    }

    public void onClaimSettled(Claim claim) {
        claim.setStatus("SETTLED");

        System.out.println("====================================");
        System.out.println("Claim " + claim.getClaimId() + " settled successfully.");
        System.out.println("Payment released to customer.");
        System.out.println("====================================");
    }
}