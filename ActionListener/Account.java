
public class Account{
    private String accountNumber;
    private IAccountListener listener;


    public Account(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setListener(IAccountListener listener){
        this.listener = listener;
    }

    public void createAccount(){
        System.out.println("Account created sucessfully");
        if(listener != null){
            listener.accountCreated(this);
        }
    }

    public String getAccountNumber(){
        return accountNumber;
    }



   

}