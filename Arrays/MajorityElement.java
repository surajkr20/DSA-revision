
// https://www.geeksforgeeks.org/problems/majority-element-1587115620/1
// https://leetcode.com/problems/majority-element/

import java.util.HashMap;

public class MajorityElement {
    // naive approach - o(n^2)
    static int majorityElement(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]) count++;
            }
            if(count > n/2) return arr[i]; 
        }
        return -1;
    }

    // hashmap solution - o(n) (time and space)
    static int majorityElement02(int[] arr){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if(map.get(arr[i]) > n/2) return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};

        System.out.println(majorityElement(arr));
        System.out.println(majorityElement02(arr));
    }
}
