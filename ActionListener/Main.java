public class Main {

    public static void main(String[] args) {

        Account account = new Account("ACC101");

        NotificationService service =
                new NotificationService();

        account.setListener(service);

        account.createAccount();
    }
}