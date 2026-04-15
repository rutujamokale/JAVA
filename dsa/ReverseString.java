import java.util.Scanner;

public class ReverseString{
    public static void reversestring(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] arr = input.toCharArray();

        reversestring(arr);

        System.out.print("reverse string");
        System.out.println(new String(arr));
        // String input = "hello";
        // char[] arr = input.toCharArray();
        // reversestring(arr);

        // System.out.println("reverse string:" + new String(arr));
    }
}