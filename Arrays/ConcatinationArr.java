import java.util.Arrays;

//leetcode.1929 = https://leetcode.com/problems/concatenation-of-array/

public class ConcatinationArr {
    public static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] temp = new int[n*2];
        int j = 0;
        int i = 0;
        while(i < n){
            temp[j] = nums[i];
            if(i == n-1 && temp[n] == 0) i = -1;
            i++;
            j++;
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,1};

        int[] ans = getConcatenation(arr);
        System.out.println(Arrays.toString(ans));

        boolean[] ar = new boolean[arr.length];
        System.out.println(Arrays.toString(ar));
    }
}
