package com.transflower.publishers;
import java.time.LocalDateTime;

public class Operation{
    private int fromAccount;
    private int toAccount;
    private double amount;
    private LocalDateTime TransactionDate;

    public Operation(){

    }
    public Operation(int fromAccount,int toAccount,double amount,LocalDateTime TransactionDate){

       this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.TransactionDate = TransactionDate;
    }

    public int getFromAccount(){
        return fromAccount;

    } 

    public void setFromAccount(int fromAccount){
            this.fromAccount=fromAccount;
    }

     public int getToAccount(){
            return toAccount;
    }

    public void setToAccount(int toAccount){
        this.toAccount=toAccount;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(){
        this.amount=amount;
    }

    public LocalDateTime getTransactiondate(){
        return TransactionDate;
    }

    public void setTransactiondate(LocalDateTime transactionDate){
        this.TransactionDate=transactionDate;
    }


  
}