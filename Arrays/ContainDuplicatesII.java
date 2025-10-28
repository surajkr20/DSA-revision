
// leetcode.219. Contains Duplicate II - https://leetcode.com/problems/contains-duplicate-ii/description/

import java.util.HashMap;

public class ContainDuplicatesII {
    // brute force approach - o(n ^ 2)
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                int absVal = i - j;
                if (absVal < 0)
                    absVal = absVal * -1;
                if (nums[i] == nums[j] && absVal <= k)
                    return true;
            }
        }
        return false;
    }

    // optimized approach - o(n) time and space complexities
    public static boolean containsNearbyDuplicateII(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for(int val: nums){
            if(map.containsKey(val) && (idx - map.get(val) <= k)) return true;
            else map.put(val, idx++);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        int k = 3;
        System.out.println(containsNearbyDuplicateII(nums, k));
    }
}
