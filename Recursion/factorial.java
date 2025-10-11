package Recursion;

public class factorial {
    // using recursion
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    // using loops
    public static int factorial02(int n) {
        int prod = 1;
        for (int i = n; i > 0; i--) {
            prod *= i;
        }
        return prod;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(5));
    }
}
