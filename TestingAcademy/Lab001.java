package TestingAcademy;
//FOR LOOP
public class Lab001 {
//    public static void main(String[] args) {
//        for (int i=1;i<=10;i++){
//            System.out.println(i);
//        }
//    }
//public static void main(String[] args) {
//    int n=9;
//    for (int i=1;i<=10;i++){
//        System.out.println(n+"x"+i+"="+n*i);
//    }
//}
//public static void main(String[] args) {
//    for (;;){
//        System.out.println("subash");
//    }
//}
//public static void main(String[] args) {
//    boolean b=true;
//    for (;b;){
//        System.out.println("Hi");
//    }
//}
//public static void main(String[] args) {
//    for (int i=1;i<=10;i++){
//        System.out.println(i);
//        if(i==5){
//            System.out.println("Found 5");
//        }
//    }
//    System.out.println("End");
//}
//public static void main(String[] args) {
//    for (int i=0;i<3;i++){
//        System.out.println(i);
//        for (int j=0;j<1;j++){
//            System.out.println(j);
//        }
//    }
//}
public static void main(String[] args) {
    int n = 4;
    for (int i = 0; i <= n; i++) {
        for (int j = 1; j <= n - 1; j++) {
            System.out.println(" ");
        }
        for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.println("*");
        }
        System.out.println( );
    }
}}
