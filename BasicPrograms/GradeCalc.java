package BasicPrograms;

import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args){
        System.out.println("Enter the score");
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        char grade=0;
        if (score>=90 && score<=100){
            grade='A';
        }
        else if (score>=80 && score<=90){
            grade='B';
        }
        else if (score>=70 && score<=80){
            grade='C';
        }
        else if (score>=60 && score<=70){
            grade='D';
        }else {
            grade = 'F';
        }
        System.out.println("Your Grade is "+grade);
    }
}
