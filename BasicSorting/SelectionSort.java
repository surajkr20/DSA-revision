package BasicSorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSortAlog(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,2,4,5};

        selectionSortAlog(arr);
        System.out.println(Arrays.toString(arr));
    }
}
