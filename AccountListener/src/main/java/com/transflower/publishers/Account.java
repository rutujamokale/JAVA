package com.transflower;
import java.util.*;

//Publisher
public class Account implements DepositOperation,WithdrawOperation{
    

    private int accountId;
    private String AccountHolder; 
    private double balance;
    private LocalDateTime Date;
 
    private List<AccountListener> listeners=new  ArrayList<>();
    private NotificationService service;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance){
        this.balance=balance;

    }

    public int getAccountId(){
        return accountId;
    }

    public void setAccountId(int accountId){
        this.accountId=accountId;
    }

    public String getAccountHolder(){
        return AccountListener;
    }


    public void setAccountHolder(String accountholder){
            this.accountholder=accountholder;
    }

    public LocalDateTime getDate(){
        return date;
    }

    public void setDate(LocalDateTime date){
        this.Date=date;
    }



    public Account(double amount,NotificationService notificationservice){
        this.service=notificationservice;
        balance=amount;
    }

    public void deposit(double amount){
        balance+=amount;
        checkBalance();
    }

    public void withdraw(double amount){
       balance-=amount; 
       checkBalance();
    }

    private void checkBalance(){

        if (balance < 1000) {
            for (AccountListener l : listeners) {
                l.onUnderBalance(balance);
                 service.send("Amount is less than  minimum balance policy");
            }
        }
        if (balance > 250000) {
            for (AccountListener l : listeners) {
                l.onOverBalance(balance);
                 service.send("Amount is greater than  Taxable income policy");
            }
        }
    }

    // Register listener
    public void addListener(AccountListener listener) {
        listeners.add(listener);
    }   
}
