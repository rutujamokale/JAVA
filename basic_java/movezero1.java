public class movezero1 {
    
    public void movezero(int nums[]) {

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }

            while (i<nums.length) {
                nums[i] = 0;
                i++;
                }
        }
    
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        
        movezero1 m1 = new movezero1();
        m1.movezero(nums);

        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(" ,");
            }
        }

        System.out.println("]");
    }
    
}


// Input
// nums = [0,1,0,3,12]
// 📌 Output
// [1,3,12,0,0]