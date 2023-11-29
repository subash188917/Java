package Oops;
//Access Modifiers
//-Default
//-Public
//-Private
//-Private
class AccSpeci {
    void display(){
        System.out.println("Hello World");
    }
}
class B{
    public static void main(String[] args) {
        AccSpeci obj = new AccSpeci();
        obj.display();
    }
}
