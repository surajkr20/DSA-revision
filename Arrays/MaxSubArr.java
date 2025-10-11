public class MaxSubArr {
    // Finds the maximum subarray sum using Kadane's Algorithm
    public static int maxSubArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currMax += arr[i];
            maxSum = Math.max(maxSum, currMax);
            if(currMax < 0) currMax = 0;
        }
        return maxSum;
    }

    public static void printSubArr(int[] nums){
        for(int st=0; st<nums.length; st++){
            for(int end=st; end<nums.length; end++){
                for(int i=st; i<=end; i++){
                    System.out.print(nums[i]);
                }
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1};
        System.out.println("Maximum subarray sum is " + maxSubArraySum(arr));

        printSubArr(arr);
    }
}