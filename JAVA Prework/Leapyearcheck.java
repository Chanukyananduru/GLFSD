public class Leapyearcheck{
    public static void main (String[] args){
        int year = 1200;
            if (year%400 ==0){
                System.out.println("The year is a leap year");
            }
            else if(year%100==0 && year%400!=0) {
                System.out.println("The year is not a leap year");
            }
            else if (year%4==0 && year%100!=0){
                System.out.println("The year is a leap year");
            }
            else {
                System.out.println("The year is not a leap year");
            }
    }
}