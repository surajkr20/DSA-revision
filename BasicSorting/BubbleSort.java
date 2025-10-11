package BasicSorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubblesort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            boolean isSwap = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            if(!isSwap) return; // already sorted..
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,2,4,5};

        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
