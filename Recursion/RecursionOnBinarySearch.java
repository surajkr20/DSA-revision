package Recursion;

public class RecursionOnBinarySearch {
    // binary search using recursion
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    // using recursion
    public static int search02(int[] arr, int target, int start, int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] <= target)
                return search02(arr, target, mid + 1, end);
            else
                return search02(arr, target, start, mid - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 9;
        System.out.println(search02(arr, target, 0, arr.length - 1));
    }
}
