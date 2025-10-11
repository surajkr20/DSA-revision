package Recursion;

public class basics {
    // print n to 1
    public static void print(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        print(n - 1);
    }

    // sum of n numbers
    public static int SumOfNumbers(int n) {
        if (n == 0)
            return n;
        return n + SumOfNumbers(n - 1);
    }

    public static void main(String[] args) {
        // print(5);

        System.out.println(SumOfNumbers(5));
    }
}