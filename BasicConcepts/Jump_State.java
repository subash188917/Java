package BasicConcepts;

public class Jump_State {
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            if(i==5){
//                break;  // break is used for break the iterative only display before 4
                  continue; //only break the value display for before 5 and after 5
            }
            System.out.println(i);
        }
    }
}
