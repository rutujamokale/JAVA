package com.transflower;
//Handler
public class AccountsDepartment implements AccountListener {

    @Override
    public void onUnderBalance(double balance) {
        System.out.println(" UNDER BALANCE ALERT! Current Balance: " + balance);
    }

    @Override
    public void onOverBalance(double balance) {
        System.out.println("OVER BALANCE ALERT! Current Balance: " + balance);
    }
}