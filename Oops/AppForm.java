//class & Obj program
package Oops;

public class AppForm {    //class -class is a collection of fields and methods
    String name;
    int rollno;
    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }

}
class Maain{
    public static void main(String[] args) {
        AppForm app = new AppForm();        //Obj creating
        app.name = "subash";
        app.rollno=70;
        app.display();

        AppForm user = new AppForm();
        user.name="pradee";
        user.rollno=1;
        user.display();
    }
}
