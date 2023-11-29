package BasicConcepts;

public class Array {
    public static void main(String[] args){
        char[] rollno = new char[5];
        rollno[0] = '1';
        rollno[3] = '6';
        for (int i=0;i<50;i++) {
            System.out.println(rollno[i]);
        }
    }
}
