public class Movezero{
    public void Movezero(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }

        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }

    public static void main(String[] args) {
        Movezero m1 = new Movezero();
        int[] nums = { 0, 1, 0, 3, 12 };
        m1.Movezero(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

