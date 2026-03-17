
public class secondlarge1 {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 20, 8, 25 };
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondlargest = largest;
                largest = num;
            } else if (num > secondlargest && num != largest) {
                secondlargest = num;
            }
        }
        
        System.out.println("second largest:" + secondlargest);
    }
}
