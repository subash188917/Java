package BasicPrograms;
import java.util.Scanner;
public class LeapYearCheck {
    public static void main(String[] args) {
//        int year = 2024;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year= sc.nextInt();

        boolean isLeapYear = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }
        if (isLeapYear) {
            System.out.println(year + "is a leap year");
        } else {
            System.out.println(year + "is not leap year");
        }
    }
}