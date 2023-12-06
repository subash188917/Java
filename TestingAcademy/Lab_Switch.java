package TestingAcademy;

import java.util.Scanner;
import java.util.Locale;

public class Lab_Switch {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter day");
//        int day= sc.nextInt();
//        switch (day){
//            case  1:
//                System.out.println("Mon");
//                break;
//            case  2:
//                System.out.println("Tue");
//                break;
//            case  3:
//                System.out.println("Wed");
//                break;
//            case  4:
//                System.out.println("Thur");
//                break;
//            case  5:
//                System.out.println("Fri");
//                break;
//            case  6:
//                System.out.println("Sat");
//                break;
//            case  7:
//                System.out.println("Sun");
//                break;
//            default:
//                System.out.println("Invalid");
//
//        }
//        System.out.println("outside of the loop");
//    }
//public static void main(String[] args) {
//    System.out.println("Enter a char");
//    Scanner sc=new Scanner(System.in);
//    String c= sc.next();
//    c=c.toLowerCase(Locale.ROOT);
//
//    switch (c){
//        case "a":
//        case "e":
//        case "i":
//        case "o":
//        case "u":
//            System.out.println("It is vowel");
//            break;
//        default:
//            System.out.println("Not a vowels");
//
//    }
//}
//public static void main(String[] args) {
//    byte b=20;
//    switch (b){
//        case 10:
//            System.out.println("TEN");
//        case 127:
//            System.out.println("127");
//    }
//}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the three 1-3 in one state");

    int state= sc.nextInt();
    switch (state){
        default:
            System.out.println("Invalid state");
        case 1:
            System.out.println("Next will be yellow");
            break;
        case 2:
            System.out.println("Next will be Green");
            break;
        case 3:
            System.out.println("Next will be Red");
            break;
    }
}
}
