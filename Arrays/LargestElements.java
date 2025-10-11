
import java.util.Arrays;
import java.util.Scanner;

public class LargestElements {
    static int sumOfArrElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    static void reverseArr(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void findLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println("Max number of in the Arrray: " + max);
        System.out.println("Min number of int array: " + min);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your size of array : ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        // input in array
        System.out.print("Now Enter your array's element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        findLargest(arr);
        int value = sumOfArrElements(arr);
        System.out.println("sum of all array elements: " + value);
        System.out.println("actual arra: " + Arrays.toString(arr));
        reverseArr(arr);
        System.out.println("reversed arr: " + Arrays.toString(arr));
    }
}
