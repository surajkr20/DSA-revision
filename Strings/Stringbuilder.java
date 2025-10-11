package Strings;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append("world");
        sb.toString();
        sb.insert(5, "hii");    // add string from 5th index
        System.out.println(sb.substring(2, 5));
        sb.replace(5, 8, " ");  // index 5-8 replace with space
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
