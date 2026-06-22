package com.transflower.Managers;
import com.transflower.Managers.FileIoManager;
import java.util.List;


public class AccountManager implements FundTransferOperation{


        FileIoManager filemgr=new FileIoManager();
        List<Account> accounts= new ArrayList<Account>();
    
        public AccountManager(){ 
            
        }

        public void Credit(int accountId,double amount){
             accounts = filemgr.LoadFromFile("Account.json");
            for(Account ac :accounts){
                if(ac.getAccountId()==accountId){
                    double newbalance=ac.getBalance() + amount;
                    ac.setBalance(newbalance);
                    filemgr.saveToFile("Account.json",accounts);
                }
            }
        }

        

        public void Debit(int accountId,double amount ){
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
            Debit(fromAccountId,amount);
            Credit(toAccountId,amount);
        }
        catch(Exception e){
                e.printStackTrace();
        }
            return true;

                                
    }                                
}
