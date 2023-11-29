package Oops;

public class Methods {
//    public static void main(String[] args) {
//        System.out.println(add(10,15));
//        System.out.println("A is printed");
//    }
public static void main(String[] args) {
    int res = add(15,15);
    res = res*10;
    System.out.println(res);
    System.out.println("a is printed");
}

//    public static void add() {  //Void function without parameter
//        int a = 10;
//        int b= 15;
//        int c=a+b;
//        System.out.println(c);
//    }
//    public static void add(int a,int b){    //Void with parameter
//        int c=a+b;
//        System.out.println(c);
//    }
    public static int add(int a,int b){     //non void
        int c = a+b;
        return c;
    }
}
