package Strings;

// https://www.geeksforgeeks.org/problems/change-the-string3541/1

public class changeTheString {
    // first approach
    public static String modify(String s) {
        char firstChar = s.charAt(0);
        if (Character.isLowerCase(firstChar)) {
            s = s.toLowerCase();
        } else {
            s = s.toUpperCase();
        }
        return s;
    }

    // 2nd approach
    public static String modify02(String str) {
        char ch = str.charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(modify("SurajJLKJLK"));
    }
}
