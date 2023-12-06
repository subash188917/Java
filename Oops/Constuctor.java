package Oops;

public class Constuctor {
    int rolno;
    int marks;
    Constuctor(int num,int mark){
        System.out.println("This is default Constructor");
        rolno=num;
        marks=mark;
    }
}

class Sample{
    public static void main(String[] args) {
        Constuctor obj = new Constuctor(78,33);
        System.out.println(obj.marks);
        System.out.println(obj.rolno);
    }
}

