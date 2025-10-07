
import java.util.Scanner;

public class factorialRecursive {
    
    static long factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n *factorial(n-1);
        }

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();

        long result =factorial(num);

        System.out.println("factorial of" +num+ "is:" +result);
    }
}
