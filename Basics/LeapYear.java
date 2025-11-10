
// if any number divisible by 400 thant it's leap year
// if any year divisible by 4 and it's not divisible by 400 that it also leap year
// if any year divible by 100 and it's not divible by 400 than it's not leap year

public class LeapYear {
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
