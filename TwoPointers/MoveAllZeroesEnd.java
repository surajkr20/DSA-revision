
import java.util.Arrays;

public class MoveAllZeroesEnd {
    // brute force approach >> o(n) time and space complexities
    static int[] pushZerosToEnd(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }
        }
        // fill remaining space in to zero
        while(j < n){
            temp[j] = 0;
            j++;
        }
        // copy temp elements in the original 
        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }

        return arr;
    }

    // better approach - two traversals >> o(n) time and o(1) space coplexities 
    public static int[] moveZeros(int[] nums){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[count] = nums[i];
                count++;
            }
        }
        while(count < nums.length){
            nums[count] = 0;
            count++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int[] ans = moveZeros(arr);
        System.out.println(Arrays.toString(ans));
    }
}
