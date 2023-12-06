package Oops;
import java.util.Scanner;
public class Scan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value");
        char a = input.next().charAt(0);
        System.out.println(a);

        Scanner input1 = new Scanner(System.in);
        System.out.println("enter a int");
        int num=input1.nextInt();
        System.out.println(num);

        Scanner input2 = new Scanner(System.in);
        System.out.println("enter a float");
        float flo=input2.nextFloat();
        System.out.println(flo);

        Scanner input3 = new Scanner(System.in);
        System.out.println("enter a double");
        double dou=input3.nextDouble();
        System.out.println(dou);

        Scanner input4 = new Scanner(System.in);
        System.out.println("enter a string");
        String str=input4.nextLine();
        System.out.println(str);
    }
}

//int=nextInt
//float=nextFloat
//double=nextDouble
//char=next
//string=nextLine