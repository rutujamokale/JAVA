package com.transflower.InsuranceRestApi;

public class Policy{
    private String PolicyNumber;
    private String CustomerName;
    private String PolicyType;
    private double PolicyAmount;

    private boolean IsRenewed;

    public String getPolicyNumber() {
        return PolicyNumber;
    }

    public void setPolicyNumber(string PolicyNumber){
        this.PolicyNumber = PolicyNumber;

    }

    public String getCustomerName(){
        return CustomerName;
    }

    public void setCustomerName(String CustomerName){
        this.CustomerName = CustomerName;
    }

    public String getPolicyType(){
        return PolicyType;
    }

    public void setPolicyType(String PolicyType){
        this.PolicyType = PolicyType;
    }       

    public double getPolicyAmount(){
        return PolicyAmount;
    }   
    public void setPolicyAmount(double PolicyAmount){
        this.PolicyAmount = PolicyAmount;
    }

    public boolean getIsRenewed(){
        return IsRenewed;
    }
    public void setIsRenewed(boolean IsRenewed){
        this.IsRenewed = IsRenewed;
    }

    
}