package BasicConcepts;

public class SumOfNum_forloop {
    public static void main(String[] args){
//        int n=5;
//        int sum=0;
//        for (int i=1;i<=n;i++){
//            sum=sum+i;            //sum+=i;
//        }
//        System.out.println("Sum of n number is"+sum);

                    //...........Factorial...... //
        int i,n=5,fact=1;
        for (i=1;i<=n;i++){
            fact = fact*i;          //fact*=i;
        }
        System.out.println("Factorial is: "+fact);
    }
}
