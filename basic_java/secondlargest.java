import java.util.Arrays;

public class secondlargest {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 20, 8, 25 };

        Arrays.sort(arr);
        int secondlargest = arr[arr.length - 2];
        System.out.println("second largest:" + secondlargest);
    }
}
