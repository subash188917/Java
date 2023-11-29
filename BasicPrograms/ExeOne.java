package BasicPrograms;

import java.util.Scanner;

public class ExeOne {
    public static void main(String[] args){
        System.out.println("Enter the value of a,b,c \n i will give you the maximum of number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Your inputs are"+a+" "+b+" "+c);
        if (a>b && a>c){
            System.out.println("Max is" +a);
        }
        else if (b>a && b>c){
            System.out.println("Max is" +b);
        }
        else {
            System.out.println("Max is" +c);
        }
    }
}
