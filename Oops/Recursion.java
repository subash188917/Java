package Oops;

//RECURSION->Two types
//-->Base Case
//-->Recursive Case




public class Recursion {
    public static void main(String[] args) {

        natPrint(10);
    }

    public static void natPrint(int n) {
        //Base Case
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(n);
            natPrint(n - 1);
        }
    }
}
