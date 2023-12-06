package Oops;

public class ExceptionHandling {
    static void check(int age) {
        throw new ArithmeticException("Age invalid");
    }

    public static void main(String[] args) {
        int a=5;
        try {
            check(17);
        }
        catch (ArithmeticException E){
            System.out.println(E.getMessage());
        }

        System.out.println("Hello");
    }
}
