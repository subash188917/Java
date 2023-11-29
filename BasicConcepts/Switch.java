package BasicConcepts;

public class Switch {
    public static void main(String[] srgs){
        char attendance='O';
        switch (attendance){
            case 'O':
                System.out.println("On Duty");
                break;
            case 'P':
                System.out.println("Attended Class");
                break;
            case 'A':
                System.out.println("Not-Attended class");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
