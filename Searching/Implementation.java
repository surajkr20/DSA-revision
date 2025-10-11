package Searching;

public class Implementation {
    // Binary search algorithm
    public static int binarySearch(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] < target)
                st = mid + 1;
            else if (arr[mid] > target)
                end = mid - 1;
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int target = 0;

        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}
