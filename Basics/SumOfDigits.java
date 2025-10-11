import java.util.Scanner;

public class SumOfDigits {
    static int sum(int n){
        int sum = 0;
        int count = 0;
        int reverse = 0;
        while(n != 0){
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
            count++;
        }
        System.out.println("total no of digits: " + count);
        System.out.println("reversed no: " + reverse);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value: ");
        int num = sc.nextInt();

        int ans = sum(num);
        System.out.println(ans);
    }
}
