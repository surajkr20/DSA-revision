import java.util.Scanner;

public class EvenOrOdd {

    static void printMax(int num1, int num2, int num3){
        if(num1 > num2) System.out.println("num1 is greater than num2");
        else if(num2 > num1) System.out.println("num2 is greater than num1");
        else System.out.println("both are equal");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your digit: ");
        int num = sc.nextInt();

        // check number
        if(num < 0) System.out.println("negative");
        else if(num > 0) System.out.println("positive");
        else System.out.println("zero");

        // even or odd
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        printMax(12, 32, 43);
    }
}