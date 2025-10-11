import java.util.HashMap;
import java.util.Map;

// Leetcode.217 -> https://leetcode.com/problems/contains-duplicate/

public class ContainDuplicates {
    // brute force approach - o(n^2)
    public static boolean containsDuplicate(int[] nums){
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] == nums[j]) return true;
            }
        }
        return false;
    }

    // optimized approach --> t.c - o(n) & and s.c - o(n)
    public static boolean containsDuplicate02(int[] nums){
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue() > 1) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3,3};
        boolean result = containsDuplicate02(arr);
        System.out.println(result);
    }
}

