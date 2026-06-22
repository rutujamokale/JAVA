package com.transflower.Managers;
import com.transflower.publishers.Account;
import java.util.List;
import java.util.ArrayList;
import com.transflower.publishers.operations.DepositeOperation;
import com.transflower.publishers.operations.WithdrawOperation;
import com.transflower.publishers.operations.FundTransferOperation;


public class AccountManager implements FundTransferOperation,DepositeOperation,WithdrawOperation{

        FileIoManager filemgr = new FileIoManager();
        List<Account> accounts = new ArrayList<>();
        public void deposit(int accountId,double amount){
             accounts = filemgr.LoadFromFile("Account.json");
            for(Account ac :accounts){
                if(ac.getAccountId()==accountId){
                    double newbalance=ac.getBalance() + amount;
                    ac.setBalance(newbalance);
                    filemgr.saveToFile("Account.json",accounts);
                }
            }
        }

        public void withdraw(int accountId,double amount ){
            accounts = filemgr.LoadFromFile("Account.json");
            for(Account ac: accounts){
                if(ac.getAccountId()== accountId){
                    double newbalance=ac.getBalance() - amount;
                    ac.setBalance(newbalance);
                    filemgr.saveToFile("Account.json",accounts);
                }
            }
        }
        
    public boolean FundTransfer( int fromAccountId, int toAccountId, double amount){

        try{
            withdraw(fromAccountId,amount);
            deposit(toAccountId,amount);
        }
        catch(Exception e){
                e.printStackTrace();
        }
            return true;

                                
    }                                
}
