package Recursion;

public class ArrSorted {
    // check arr sorted or not - using loops
    public static boolean check(int[] arr) {
        int i = 0;
        while (i < arr.length-1) {
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }

    // using recursion
    public static boolean check02(int[] arr, int n){
        if(n == 0 || n == 1) return true;
        return arr[n-1] >= arr[n-2] && check02(arr, n-1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4 };
        System.out.println(check02(arr, arr.length));
    }
}
