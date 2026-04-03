
import java.util.HashMap;
import java.util.Map;

public class arrays {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 13;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                System.out.println(map.get(diff) + " " + i);
            }
            map.put(nums[i], i);
        }

    }
}

// Input: nums = [2,7,11,15], target = 9  
// Output: [0,2]
// 👉 Concepts:
// Arrays
// HashMap
