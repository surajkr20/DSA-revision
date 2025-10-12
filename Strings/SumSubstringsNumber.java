package Strings;

// https://www.geeksforgeeks.org/problems/sum-of-all-substrings-of-a-number-1587115621/1

public class SumSubstringsNumber {
    public static int sumSubstrings(String str){
        int n = str.length(); 
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                int num = Integer.parseInt(str.substring(i, j));
                sum = sum + num;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String str = "6759";
        System.out.println(sumSubstrings(str));
    }
}
