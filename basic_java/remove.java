
public class remove {

    public static int remove(int[] nums, int val) {

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                i++;
                nums[i] = nums[j];
            }

        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = remove(nums, val);

        System.out.println("K=" + k);

        System.out.print("output:[");
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i] + " ");

            if (i < k - 1) {
                System.out.print(" ,");
            }
        }
        System.out.println("]");
    }
}
