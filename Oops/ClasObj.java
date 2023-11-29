package Oops;
//Class == collection of variables or identifiers and methods.
class ClasObj {
    String name;
    int rollno;

    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }

    public static void main(String[] args) {
        ClasObj clob = new ClasObj();   //Object- Object is a instance of class.
        clob.name = "Subash";
        clob.rollno = 70;
        clob.display();
    }

}
