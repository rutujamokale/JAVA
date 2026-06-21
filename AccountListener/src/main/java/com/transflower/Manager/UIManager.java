

public class UIManager{

    public void getMenu(){

        Scanner sc= new Scanner(System.in);
        AccountManager mgr = new AccountManager();
        System.out.println("**************************************");

        System.out.println("1.show balance:");

        System.out.println("2.Credit:");

        System.out.println("3.Debit:");

        System.out.println("4.Transfer:");

        System.out.println("5.Exit");

        System.out.println("*******************************************");

       System.out.println("Enter your choice");
       int choice = sc.nextInt();

       Switch(choice){

            case 1:
                System.out.print("Enter Account id ");
                int accountId = sc.nextInt();
                break;

            case 2:
                System.out.print("Enter Account Id:");
                accountId = sc.nextInt();

                System.out.print("Enter Amount:");
                double amount = sc.nextDouble();

                mgr.Credit(accountId,amount);
                System.out.println("amount credited sucessfully");

                   
       }



                    



    }

}
