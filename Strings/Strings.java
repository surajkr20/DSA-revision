package Strings;

public class Strings {
    public static void main(String[] args) {
        String str = "abhinav";
        String str2 = "suraj";
        System.out.println(str);
        System.out.println(str.toUpperCase());

        System.out.println(str.equals(str2));

        System.out.println(str.startsWith("ab"));
        System.out.println(str2.endsWith("aj"));

        System.out.println(str.substring(2, 4));
    }
}
