package Recursion;

public class fibo {
    // using loops -
    public static int compute(int n){
        int prev = 0;
        int next = 1;
        int sum = 0;
        for(int i=1; i<=n; i++){    // 1, 2, 3, 5, 8
            sum = prev + next;
            prev = next;
            next = sum;
        }
        return sum;
    }

    // using recursion
    public static int compute02(int n){
        if(n == 0 || n == 1) return n;
        return compute02(n-1) + compute02(n-2);
    }

    public static void main(String[] args) {
        System.out.println(compute02(8));
    }
}
