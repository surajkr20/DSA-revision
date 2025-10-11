package BasicSorting;

import java.util.Arrays;

public class insertionSort {
    public static void sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0){
                if(arr[j] > temp) arr[j+1] = arr[j];
                else break;
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,2,4,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
