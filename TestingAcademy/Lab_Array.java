package TestingAcademy;
import java.lang.*;

import java.util.Scanner;

public class Lab_Array {
//    public static void main(String[] args) {
//        int math_mark=90;
//        int sc=91;
//        int sst=89;
//        int tamil=87;
//
//        //Arrays
//        int[] numbers={90,91,89,87};
//
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//
//        System.out.println("-------------------");
//        int[] numbers2 =new int[4];
//        numbers2[0]=10;
//        numbers2[1]=11;
//        numbers2[2]=12;
//        numbers2[3]=13;
//    }

//    public static void main(String[] args) {
//        System.out.println("Enter a how many elements you want to store");
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        int[] user_array=new int[n];
//        for (int i=1;i<user_array.length;i++){
//            System.out.println(user_array[i]);
//        }
//    }
//public static void main(String[] args) {
////    int[] marks = new int[5];
//    String[] fruits = new String[2];
//    fruits[0]="orange";
//    fruits[1]="apple";
////    System.out.println(marks[0]);
////    System.out.println(fruits[0]);
//    System.out.println(fruits.length);
//    for (int i=0;i<2;i++){
//        System.out.println(fruits[i]);
//    }
//}
//public static void main(String[] args) {
//    boolean[] isMarried = new boolean[3];
//    for (int i=0;i<= isMarried.length;i++){
//        System.out.println(isMarried[i]);
//    }
//}
//public static void main(String[] args) {
//    System.out.println("Enter Subject count");
//    Scanner sc = new Scanner(System.in);
//    int total_subjects = sc.nextInt();
//
//    int[] marks = new int[total_subjects];
//    for (int i = 0; i < marks.length; i++) {
//        System.out.println("Enter marks one by one");
//        marks[i] = sc.nextInt(); // marks [0], marks [1], marks[2]
//    }
//
//    System.out.println(" Here is your marks");
//
//    for (int i = 0; i < marks.length ; i++) {
//        System.out.println("Here is your marks of sub -> " + marks[i]);
//    }
//
//    // 91, 90, 93
//    int max = marks[0];
//    for (int i = 0; i < marks.length; i++) {
//        if(marks[i]> max){
//            max = marks[i];
//        }
//    }
//
//
//    for (int i = 0; i < marks.length ; i++) {
//        System.out.println("Here is your marks of sub -> " + marks[i]);
//    }
//
//    // Collections - in built functions that you can use
//
//    System.out.println("Max is -> "+max);
//
//
//
//
//
//}
//public static void main(String[] args) {
//    int[] marks = new int[3]; // 0,0,0
//    int[] marks2 = {1,2,3}; // 1, 2, 3
//
//
//    // 2D
//    int [][] matrix = {
//            {1,2,3},
//            {4,5,6},
//            {7,8,9}
//    };
//
//    int [][] matrix2 = new int[3][3];
//    matrix2[0][0] = 1;
//    matrix2[0][1] = 2;
//    matrix2[0][2] = 3;
//    matrix2[1][0] = 4;
//    matrix2[1][1] = 5;
//    matrix2[1][2] = 6;
//    matrix2[2][0] = 7;
//    matrix2[2][1] = 8;
//    matrix2[2][2] = 9;
//
//
//
//
//    // print all the elements
//    for (int i = 0; i < matrix.length ; i++) {
//        for (int j = 0; j < matrix[i].length; j++) {
//            System.out.print(matrix[i][j]+ " ");
//        }
//        System.out.println(" ");
//    }
//
//
//
//}
public static void main(String[] args) {
    int[][][] threeArray = new int[2][3][4];
    for (int i=0;i<2;i++){
        for (int j=0;j<3;j++){
            for (int k=0;k<4;k++){
                System.out.println(threeArray[i][j][k]);
            }
        }
    }
}
}





