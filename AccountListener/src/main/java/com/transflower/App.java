package com.transflower;

public class App 
{
    public static void main( String[] args )
    {
         Account account = new Account(5000);

        // attach listener (+=)
        
       account.addListener(new AccountsDepartment());

        // transactions
        account.withdraw(4500);  // triggers under balance
        account.deposit(300000); // triggers over balance
    }
}