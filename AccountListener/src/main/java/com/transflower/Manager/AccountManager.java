package com.transflower;

public class AccountManager implements FundTransferOperation{


        FileIoManager filemgr=new FileIoManager();
        List<Account> accounts= new ArrayList<Account>();
        accounts = filemgr.LoadFromFile("Account.json");

        public AccountManager(){
            Account a1=new Account(1,"Rutaa",5000,LocalDateTime.now());
            Account a2 =new Account(2,"Nikita",10000,LocalDateTime.now());
            accounts.add(a1);
            accounts.add(a2);
            try{
            filemgr.saveToFile("Account.json",accounts);
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        public void Credit(int accountId,double amount){
        try {
            for(Account ac :accounts){
                if(ac.getAccountId()==accountId){
                    double newbalance=ac.getBalance() + amount;
                    ac.setBalance(newbalance);
                    filemgr.saveToFile("Account.json",accounts);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        }

        public void Debit(int accountId,double amount ){
            try{
            for(Account ac: accounts){
                if(ac.getAccountId()== accountId){
                    double newbalance=ac.getBalance() - amount;
                    ac.setBalance(newbalance);
                    filemgr.saveToFile("Account.json",accounts);
                }
            }
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        
    public boolean FundTransfer( int fromAccountId, int toAccountId, double amount){
            Debit(fromAccountId,amount);
            Credit(toAccountId,amount);

                                
    }
}
