public class LeapYear {

    static int sumOfN(int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + i;
        }
        return sum;
    }

    static void table(int n){
        for(int i=n; i<=n*10; i=i+n){
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        int year = 2300;

        if(year % 400 == 0) System.out.println("leap year");
        else if(year % 100 == 0){
            if(year % 400 != 0) System.out.println("Not a leap year");
        }else if(year % 4 == 0){
            if(year % 100 != 0) System.out.println("leap year");
        }else{
            System.out.println("Not leap year");
        }
    }
}
