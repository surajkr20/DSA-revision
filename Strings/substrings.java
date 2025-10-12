package Strings;

public class substrings {
    public static void printAllSubstrings(String str){
        int n = str.length();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                
                System.out.print(str.substring(i, j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String str = "suraj";

        // by built in methods
        // System.out.println(str.substring(0));
        // System.out.println(str.substring(0, 5));
        // System.out.println(str.substring(3, 8));

        printAllSubstrings(str);
    }
}
