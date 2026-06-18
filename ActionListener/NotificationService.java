

public class NotificationService implements IAccountListener{
    @Override
    public void accountCreated(Account account) {
        System.out.println("Notification: Account " + account.getAccountNumber() + " has been created successfully.");
    }

}