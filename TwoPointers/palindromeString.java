
public class palindromeString {
    // using two pointers approach
    public static boolean checkPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    // using brute force
    public static boolean checkPalindrome02(String str) {
        char[] arr = str.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        String newStr = new String(arr);
        if (str.equals(newStr))
            return true;
        return false;
    }

    public static void main(String[] args) {
        String str = "suraj";
        System.out.println(checkPalindrome02(str));
    }
}
