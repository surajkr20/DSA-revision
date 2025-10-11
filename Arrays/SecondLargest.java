public class SecondLargest {
    public static int SecondLargestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i])
                max = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (max2 < nums[i] && max != nums[i])
                max2 = nums[i];
        }
        if (max2 > -1)
            return max2;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 8, 7, 6, 5 };

        System.out.println(SecondLargestElement(arr));
    }
}
