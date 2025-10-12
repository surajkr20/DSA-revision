package Strings;

import java.util.Scanner;

// In Java:

// 1. == compares object references (memory addresses).
// 2. .equals() compares actual contents (characters) inside the strings.

public class Palindrome {
    // first approach
    public static String palindromeStr(String str){
        char[] newStr = str.toCharArray(); // convert string into array
        int i = 0;
        int j = newStr.length-1;
        while(i <= j){ 
            char temp = newStr[i];
            newStr[i] = newStr[j];
            newStr[j] = temp;
            i++;
            j--;
        }
        String reversedStr = new String(newStr); // array to string
        System.out.println("reversed string : " + reversedStr);
        if(str.equals(reversedStr)) return "palindrome string";
        else return "Not palindrome string";
    }

    // 2nd approach
    public static boolean palindromeStr02(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i <= j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your strings: ");
        String str = sc.nextLine();
       
        String ans = palindromeStr(str);
        System.out.println("ans: " + ans);
        
        System.out.println(palindromeStr02(str));
    }
}
