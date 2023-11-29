package BasicConcepts;

public class Conditional_State {
    public static void main(String[] args){
        char attendance='p';
        int total=40;
        if(attendance == 'p'){
            if (total >=50){
                System.out.println("Attended classes");
            }
            else {
                System.out.println("Not attended classes");
            }
        }

        System.out.println("programs ends");
    }

}
