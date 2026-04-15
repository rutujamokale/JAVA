public class palindromenum {
    public static boolean isPalindome(int num) {

        int original = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;

        }

       return original == rev;
    }
    
    public static void main(String[] args) {
        int num = 121;
        if (isPalindome(num)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
