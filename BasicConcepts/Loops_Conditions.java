package BasicConcepts;

public class Loops_Conditions {
    public static void main(String[] args){
        int i=1;
        int sum=0;
        int n=5;
//        while (i<=n){
//            sum+=i;
//            i++;
//        }
        do {
            sum+=i;
            i++;
        }while (i<=n);
        System.out.println("Sum of n num: "+sum);
    }

    }


