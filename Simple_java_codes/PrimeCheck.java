
import java.util.Scanner;

public class PrimeCheck {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int num=sc.nextInt();
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }else{
            for(int i=2;i<=num/2;i++){
                if(num % i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime)

        System.out.println("this is prime number");
        else
        System.out.println("this is not prime number");

    }
}
    
            
