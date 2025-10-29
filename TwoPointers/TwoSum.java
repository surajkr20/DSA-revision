package TwoPointers;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    // naive approach - nested loops >> o(n*n) time and o(1) space
    static int[] approach01(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[] { i, j };
            }
        }
        return new int[] { -1, -1 };
    }

    // two pointer + sorting approach >> o(n * logn)
    static boolean approach03(int[] nums, int target){
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        while( i < j ){
            if(nums[i] + nums[j] == target) return true;
            else if(nums[i] + nums[j] < target) i++;
            else j--;
        }
        return false;
    }

    // optimal apporach - using Hashmap
    public static int[] approach02(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) return new int[]{map.get(complement), i};
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;

        int[] ans = approach02(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}